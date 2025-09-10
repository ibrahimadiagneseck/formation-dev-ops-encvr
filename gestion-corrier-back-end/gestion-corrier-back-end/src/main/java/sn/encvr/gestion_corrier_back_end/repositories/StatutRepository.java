package sn.encvr.gestion_corrier_back_end.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import sn.encvr.gestion_corrier_back_end.entities.Statut;

public interface StatutRepository extends JpaRepository<Statut, Long> {

}

