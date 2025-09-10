package sn.encvr.gestion_corrier_back_end.services;


import sn.encvr.gestion_corrier_back_end.entities.Expediteur;

import java.util.Collection;
import java.util.Optional;


public interface ExpediteurService {

    Collection<Expediteur> getAll();
    Optional<Expediteur> getById(Long id);
    Expediteur save(Expediteur expediteur);
    Expediteur update(Expediteur  expediteur);
    void deleteById(Long id);

}
