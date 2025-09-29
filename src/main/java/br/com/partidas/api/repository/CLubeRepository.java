package br.com.partidas.api.repository;

import br.com.partidas.api.model.ClubeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CLubeRepository extends JpaRepository<ClubeModel, Long> {
}
