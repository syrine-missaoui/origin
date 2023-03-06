package tn.esprit.asi.ski_projet.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.ski_projet.Controllers.AbonnementController;
import tn.esprit.asi.ski_projet.Controllers.AbonnementController;
import tn.esprit.asi.ski_projet.Entities.Skieur;
import tn.esprit.asi.ski_projet.Entities.TypeAbonnement;
import tn.esprit.asi.ski_projet.Services.IskieurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/skieur")
public class SkieurController {
    private IskieurService iskieurService;

    @PostMapping("/add")
    public Skieur addSkieur(@RequestBody Skieur s) {
        return iskieurService.addSkieur(s);
    }

    @PutMapping("/update")
    public Skieur updateSkieur(@RequestBody Skieur skieur) {
        return iskieurService.updateSkieur(skieur);
    }

    @GetMapping("/get/{id}")
    public Skieur getSkieur(@PathVariable("id") Long numSkieur) {
        return iskieurService.retrieveSkieur(numSkieur);
    }

    @GetMapping("/getAll")
    public List<Skieur> getAllSkieurs() {
        return iskieurService.retrieveAllSkieurs();
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable("id")Long id){ iskieurService.removeSkieur(id);

    }
    @PutMapping("/{numSkieur}/{numPiste}")

   public  Skieur assignSkierToPiste(@PathVariable Long numSkieur,@PathVariable Long numPiste){

        return iskieurService.assignSkierToPiste(numSkieur,numPiste);
   }
    @PutMapping("/{numSkieur}/{numAbon}")
    public Skieur skieurtoAbo(@PathVariable long numSkieur, @PathVariable long numAbon){
        return iskieurService.skieurtoAbo(numSkieur,numAbon);
    }

    public List<Skieur> retrieveSkiersBySubscriptionType (TypeAbonnement typeAbonnement){


        return iskieurService.retrieveSkiersBySubscriptionType(typeAbonnement);
    }




}


