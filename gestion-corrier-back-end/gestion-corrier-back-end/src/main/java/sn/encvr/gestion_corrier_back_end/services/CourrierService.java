package sn.encvr.gestion_corrier_back_end.services;


import sn.encvr.gestion_corrier_back_end.entities.Courrier;

import java.util.Collection;
import java.util.Optional;

public interface CourrierService {
    Collection<Courrier> getAll();
    Optional<Courrier> getById(Long id);
    Courrier save(Courrier courrier);
    Courrier update(Courrier  courrier);
    void deleteById(Long id);

}
