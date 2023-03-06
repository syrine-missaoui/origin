package tn.esprit.asi.ski_projet.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.asi.ski_projet.Entities.Abonnement;
import tn.esprit.asi.ski_projet.Entities.Piste;
import tn.esprit.asi.ski_projet.Entities.Skieur;
import tn.esprit.asi.ski_projet.Entities.TypeAbonnement;
import tn.esprit.asi.ski_projet.Repositories.AbonnementRepo;
import tn.esprit.asi.ski_projet.Repositories.PisteRepo;
import tn.esprit.asi.ski_projet.Repositories.SkieurRepo;


import java.util.List;

@AllArgsConstructor
@Service
public class SkieurServiceImpl implements IskieurService {

    private SkieurRepo skieurRepo;
    private PisteRepo pisteRepo;
    private AbonnementRepo abonRepository;

    @Override
    public Skieur addSkieur(Skieur s) {
        return skieurRepo.save(s);
    }


    @Override
    public void removeSkieur(Long id) {
        skieurRepo.deleteById(id);
    }

    @Override
    public Skieur updateSkieur(Skieur s) {
        return skieurRepo.save(s);
    }

    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepo.findAll();
    }

    @Override
    public Skieur retrieveSkieur(Long id) {
        return skieurRepo.findById(id).orElse(null);
    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {

            //recuperation des objets
        Skieur skieur =skieurRepo.findById(numSkieur).orElse(null);
        Assert.notNull(skieur,"skieur not found");//  Assert permet de verifier si l objet skieur null ou non
        Piste piste =pisteRepo.findById(numPiste).orElse(null);
        Assert.notNull(piste,"piste not found");

        //traitment
           /* Set<Piste> pistes = skieur.getPistes();
            pistes.add(piste);
            skieur.setPistes(pistes);*/
            skieur.getPistes().add(piste);

            //save
            return skieurRepo.save(skieur);
        }



    @Override
    public Skieur skieurtoAbo(long numSkieur, long numAbon) {
        //recuperation d'objets skieur
        Skieur skieur =  abonRepository.findById(numSkieur).orElse(null) ;
        Assert.notNull(skieur,"Skieur not found");
        //recupeartion de l'objet abonnment
        Abonnement abonnement=AbonnementRepo.findById(numAbon).orElse(null);
        Assert.notNull(abonnement,"abonnement not found");

        skieur.setAbonnement(abonnement);
        return abonRepository.save(skieur);
    }

   public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement){
     //soit nekhdem haka w ken andi barcha nmchi lel chouche  repo w nzid requete
      /* List<Skieur> list = new ArrayList<>();
       for (Skieur s :getAll()){
        if (s.getAbonnment().gettypeAbon().equals(typeAbonnement))

           }*/
       return  SkieurRepo.findByInscription




   }




