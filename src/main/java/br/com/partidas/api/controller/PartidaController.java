package br.com.partidas.api.controller;

import br.com.partidas.api.dto.PartidaDTO;
import br.com.partidas.api.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/partidas")
public class PartidaController {

    @Autowired
    private PartidaService partidaService;

    @PostMapping
    public ResponseEntity<PartidaDTO> salvarPartida(@RequestBody PartidaDTO partidaDTO) {
        PartidaDTO salvo = partidaService.salvarPartida(partidaDTO);
        return ResponseEntity.ok(salvo);
    }
}
