package br.com.partidas.api.controller;

import br.com.partidas.api.dto.ClubeDTO;
import br.com.partidas.api.service.ClubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clubes")
public class ClubeController {
    @Autowired
    private ClubeService clubeService;
    @PostMapping
    public ResponseEntity<ClubeDTO> salvarClube(@RequestBody ClubeDTO clubeDTO){
        ClubeDTO clubeDTOSalvo = clubeService.salvarClube(clubeDTO);
        return ResponseEntity.ok(clubeDTOSalvo);
    }
}
