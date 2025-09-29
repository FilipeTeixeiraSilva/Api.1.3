package br.com.partidas.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "clube")
@Data
public class ClubeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_do_clube", nullable = false, length = 50 )
    private String nome_do_clube;

    @Column(name = "estado_do_clube", nullable = false, length = 2 )
    private  String estado_do_clube;

    @Column(name = "data_de_fundacao", nullable = false)
    private LocalDate data_de_fundacao;

    @Column(name = "ativo", nullable = false)
    private  boolean ativo;
}
