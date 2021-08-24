package mana.ml.misionmutantes.repository;

import mana.ml.misionmutantes.model.Humanos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HumanosRepository extends JpaRepository<Humanos, Long> {

}
