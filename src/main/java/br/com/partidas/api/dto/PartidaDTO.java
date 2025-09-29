package br.com.partidas.api.dto;

import lombok.Data;

@Data
public class PartidaDTO {
    private Long clube_mandante_id;
    private Long clube_visitante_id;

    private String data_partida;
    private Integer gols_mandante;
    private Integer gols_visitante;
}
