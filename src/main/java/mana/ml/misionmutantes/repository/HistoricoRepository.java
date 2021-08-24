package mana.ml.misionmutantes.repository;

import mana.ml.misionmutantes.model.Mutante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoRepository extends JpaRepository<Mutante, Long> {

}
