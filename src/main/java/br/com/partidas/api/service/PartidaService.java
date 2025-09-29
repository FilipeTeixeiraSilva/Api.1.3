package br.com.partidas.api.service;

import br.com.partidas.api.dto.PartidaDTO;
import br.com.partidas.api.model.ClubeModel;
import br.com.partidas.api.model.PartidaModel;
import br.com.partidas.api.repository.CLubeRepository;
import br.com.partidas.api.repository.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PartidaService {

    @Autowired
    private PartidaRepository partidaRepository;

    @Autowired
    private CLubeRepository cLubeRepository;

    public PartidaDTO salvarPartida(PartidaDTO partidaDTO) {
        // Carregar clubes mandante e visitante
        ClubeModel mandante = cLubeRepository.findById(partidaDTO.getClube_mandante_id())
                .orElseThrow(() -> new IllegalArgumentException("Clube mandante não encontrado: id=" + partidaDTO.getClube_mandante_id()));
        ClubeModel visitante = cLubeRepository.findById(partidaDTO.getClube_visitante_id())
                .orElseThrow(() -> new IllegalArgumentException("Clube visitante não encontrado: id=" + partidaDTO.getClube_visitante_id()));

        PartidaModel partida = new PartidaModel();
        partida.setClubeMandante(mandante);
        partida.setClubeVisitante(visitante);
        partida.setDataPartida(LocalDateTime.parse(partidaDTO.getData_partida()));
        partida.setGolsMandante(partidaDTO.getGols_mandante());
        partida.setGolsVisitante(partidaDTO.getGols_visitante());

        PartidaModel salvo = partidaRepository.save(partida);

        PartidaDTO retorno = new PartidaDTO();
        retorno.setClube_mandante_id(salvo.getClubeMandante().getId());
        retorno.setClube_visitante_id(salvo.getClubeVisitante().getId());
        retorno.setData_partida(salvo.getDataPartida().toString());
        retorno.setGols_mandante(salvo.getGolsMandante());
        retorno.setGols_visitante(salvo.getGolsVisitante());
        return retorno;
    }
}
