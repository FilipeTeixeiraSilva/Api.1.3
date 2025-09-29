package br.com.partidas.api.dto;

import lombok.Data;

@Data
public class EstadioDTO {
    private String nome_do_estadio;
    private String estado_do_estadio;
    private Integer capacidade_do_estadio;
}
