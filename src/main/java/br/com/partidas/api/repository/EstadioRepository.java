package br.com.partidas.api.repository;

import br.com.partidas.api.model.EstadioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadioRepository extends JpaRepository<EstadioModel, Long> {
}
