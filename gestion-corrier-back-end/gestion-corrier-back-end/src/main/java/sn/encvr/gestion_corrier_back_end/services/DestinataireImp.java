package sn.encvr.gestion_corrier_back_end.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.encvr.gestion_corrier_back_end.entities.Destinataire;
import sn.encvr.gestion_corrier_back_end.repositories.DestinataireRepository;

import java.util.Collection;
import java.util.Optional;

@Service
public class DestinataireImp implements DestinataireService {

    @Autowired
    private DestinataireRepository destinataireRepository ;

    @Override
    public Collection<Destinataire> getAll() {
        return destinataireRepository.findAll();
    }

    @Override
    public Optional<Destinataire> getById(Long id) {
        return destinataireRepository.findById(id);
    }

    @Override
    public Destinataire save(Destinataire destinataire) {
        return destinataireRepository.save(destinataire);
    }

    @Override
    public Destinataire update(Destinataire destinataire) {
        return destinataireRepository.save(destinataire);
    }

    @Override
    public void deleteById(Long id) {
        destinataireRepository.deleteById(id);

    }
}
