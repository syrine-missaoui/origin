package tn.esprit.asi.ski_projet.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.ski_projet.Entities.Abonnement;
import tn.esprit.asi.ski_projet.Services.IAbonnementService;

import java.util.List;

@RestController

@AllArgsConstructor
public class AbonnementController {
    private IAbonnementService iAbonnementService;

    @PostMapping("/add")
    public Abonnement add(@RequestBody Abonnement p) {
        return iAbonnementService.addAbonnement(p);
    }

    @PutMapping("/update")
    public Abonnement update(@RequestBody Abonnement p) {
        return iAbonnementService.updateAbonnement(p);
    }

    @GetMapping("/get/{id}")
    public Abonnement get(@PathVariable Long id) {
        return iAbonnementService.retrieveAbonnement(id);
    }

    @GetMapping("/getAll")
    public List<Abonnement> getAll() {
        return iAbonnementService.retrieveAllAbonnements();
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable("id")Long id){ iAbonnementService.remove(id);
    }
}
