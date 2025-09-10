package sn.encvr.gestion_corrier_back_end.services;


import sn.encvr.gestion_corrier_back_end.entities.Destinataire;

import java.util.Collection;
import java.util.Optional;


public interface DestinataireService {
    Collection<Destinataire> getAll();
    Optional<Destinataire> getById(Long id);
    Destinataire save(Destinataire destinataire);
    Destinataire update(Destinataire  destinataire);
    void deleteById(Long id);

}
