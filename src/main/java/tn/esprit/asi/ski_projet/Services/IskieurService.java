package tn.esprit.asi.ski_projet.Services;



import tn.esprit.asi.ski_projet.Entities.Skieur;
import tn.esprit.asi.ski_projet.Entities.TypeAbonnement;

import java.util.List;

public interface IskieurService {
    public Skieur addSkieur(Skieur s);


    public void removeSkieur(Long id);

    public Skieur updateSkieur(Skieur s);

    public List<Skieur> retrieveAllSkieurs();

    public Skieur retrieveSkieur(Long id);


    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);


    Skieur skieurtoAbo(long numSkieur, long numAbon);

     List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);


}
