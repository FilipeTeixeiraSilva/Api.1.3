package br.com.partidas.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "partida")
@Data
public class PartidaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ClubeModel clubeMandante;

    @ManyToOne
    private ClubeModel clubeVisitante;


    private LocalDateTime dataPartida;

    private Integer golsMandante;

    private Integer golsVisitante;
}
