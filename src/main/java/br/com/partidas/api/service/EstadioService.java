package br.com.partidas.api.service;

import br.com.partidas.api.dto.EstadioDTO;
import br.com.partidas.api.model.EstadioModel;
import br.com.partidas.api.repository.EstadioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadioService {

    @Autowired
    private EstadioRepository estadioRepository;

    public EstadioDTO salvarEstadio(EstadioDTO estadioDTO){
        EstadioModel estadioModel = new EstadioModel();
        estadioModel.setNome_do_estadio(estadioDTO.getNome_do_estadio());
        estadioModel.setEstado_do_estadio(estadioDTO.getEstado_do_estadio());
        estadioModel.setCapacidade_do_estadio(estadioDTO.getCapacidade_do_estadio());

        EstadioModel estadioSalvo = estadioRepository.save(estadioModel);

        EstadioDTO estadioDTOSalvo = new EstadioDTO();
        estadioDTOSalvo.setNome_do_estadio(estadioSalvo.getNome_do_estadio());
        estadioDTOSalvo.setEstado_do_estadio(estadioSalvo.getEstado_do_estadio());
        estadioDTOSalvo.setCapacidade_do_estadio(estadioSalvo.getCapacidade_do_estadio());

        return estadioDTOSalvo;
    }
}
