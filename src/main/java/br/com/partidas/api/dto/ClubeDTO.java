package br.com.partidas.api.dto;

import lombok.Data;

@Data
public class ClubeDTO {

    private String nome_do_clube;
    private String estado_do_clube;
    private String data_de_fundacao;
    private boolean ativo;
}
