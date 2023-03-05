package tn.esprit.asi.ski_projet.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.asi.ski_projet.Entities.Abonnement;
import tn.esprit.asi.ski_projet.Repositories.AbonnementRepo;


import java.util.*;


@AllArgsConstructor
@Service
public class AbonnementService implements IAbonnementService {
    private AbonnementRepo abonnementRepo;
    private AbonnementRepo AbonnementRepo;

    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return abonnementRepo.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepo.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepo.save(abonnement);
    }

    @Override
    public Abonnement retrieveAbonnement(Long numAbonnement) {
        return abonnementRepo.findById(numAbonnement).orElse(null);
    }

    @Override
    public void remove(Long id) {
        abonnementRepo.deleteById(id);

    }
}
