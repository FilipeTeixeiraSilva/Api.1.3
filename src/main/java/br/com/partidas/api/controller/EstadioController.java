package br.com.partidas.api.controller;

import br.com.partidas.api.dto.EstadioDTO;
import br.com.partidas.api.service.EstadioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estadios")
public class EstadioController {

    @Autowired
    private EstadioService estadioService;

    @PostMapping
    public ResponseEntity<EstadioDTO> salvarEstadio(@RequestBody EstadioDTO estadioDTO){
        EstadioDTO salvo = estadioService.salvarEstadio(estadioDTO);
        return ResponseEntity.ok(salvo);
    }
}
