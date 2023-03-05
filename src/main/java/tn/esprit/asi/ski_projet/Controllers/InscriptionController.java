package tn.esprit.asi.ski_projet.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.ski_projet.Entities.Inscription;
import tn.esprit.asi.ski_projet.Services.IInscriptionService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/inscription")
public class InscriptionController {
    private IInscriptionService iInscriptionService;

    @PostMapping("/add")
    public Inscription add(@RequestBody Inscription p) {
        return iInscriptionService.addInscription(p);
    }

    @PutMapping("/update")
    public Inscription update(@RequestBody Inscription p) {
        return iInscriptionService.updateInscription(p);
    }

    @GetMapping("/get/{id}")
    public Inscription get(@PathVariable("id") Long id) {
        return iInscriptionService.retrieveInscription(id);
    }

    @GetMapping("/getAll")
    public List<Inscription> getAll() {
        return iInscriptionService.retrieveAllInscription();
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable("id")Long id){ iInscriptionService.remove(id);
    }
}
