package br.com.partidas.api.service;

import br.com.partidas.api.dto.ClubeDTO;
import br.com.partidas.api.model.ClubeModel;
import br.com.partidas.api.repository.CLubeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Objects;

@Service
public class ClubeService {
    @Autowired
    private CLubeRepository clubeRepository;

    public ClubeDTO salvarClube(ClubeDTO clubeDTO){
        ClubeModel clubeModel = new ClubeModel();
        clubeModel.setNome_do_clube(clubeDTO.getNome_do_clube());
        clubeModel.setEstado_do_clube(clubeDTO.getEstado_do_clube());
        clubeModel.setData_de_fundacao(LocalDate.parse(clubeDTO.getData_de_fundacao()));
        clubeModel.setAtivo(clubeDTO.isAtivo());

        ClubeModel clubeSalvo = clubeRepository.save(clubeModel);

        ClubeDTO clubeDTOSalvo = new ClubeDTO();
        clubeDTOSalvo.setNome_do_clube(clubeSalvo.getNome_do_clube());
        clubeDTOSalvo.setEstado_do_clube(clubeSalvo.getEstado_do_clube());
        clubeDTOSalvo.setData_de_fundacao(clubeSalvo.getData_de_fundacao().toString());
        clubeDTOSalvo.setAtivo(clubeSalvo.isAtivo());

        return clubeDTOSalvo;




    }

}
