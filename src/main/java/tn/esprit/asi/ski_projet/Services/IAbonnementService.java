package tn.esprit.asi.ski_projet.Services;



import tn.esprit.asi.ski_projet.Entities.Abonnement;

import java.util.List;

public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnements();
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement (Abonnement abonnement);
    Abonnement retrieveAbonnement(Long numAbonnement);
    void remove(Long id);
}
