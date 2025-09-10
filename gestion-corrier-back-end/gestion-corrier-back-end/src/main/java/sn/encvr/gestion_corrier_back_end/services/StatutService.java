package sn.encvr.gestion_corrier_back_end.services;

import sn.encvr.gestion_corrier_back_end.entities.Statut;

import java.util.Collection;
import java.util.Optional;


public interface StatutService {
    Collection<Statut> getAll();
    Optional<Statut> getById(Long id);
    Statut save(Statut statut);
    Statut update(Statut  statut);
    void deleteById(Long id);

}
