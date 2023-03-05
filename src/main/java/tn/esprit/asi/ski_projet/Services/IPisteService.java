package tn.esprit.asi.ski_projet.Services;



import tn.esprit.asi.ski_projet.Entities.Piste;

import java.util.List;

public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Piste retrievePiste (Long numPiste);
    void remove(Long id);
}
