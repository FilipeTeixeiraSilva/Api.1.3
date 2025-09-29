package br.com.partidas.api.repository;

import br.com.partidas.api.model.PartidaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidaRepository extends JpaRepository<PartidaModel, Long> {
}
