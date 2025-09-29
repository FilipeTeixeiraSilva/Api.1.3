package br.com.partidas.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "estadio")
@Data
public class EstadioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome_do_estadio;

    private String estado_do_estadio;

    private Integer capacidade_do_estadio;

}
