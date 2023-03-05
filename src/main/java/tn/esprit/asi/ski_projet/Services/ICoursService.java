package tn.esprit.asi.ski_projet.Services;



import tn.esprit.asi.ski_projet.Entities.Cours;

import java.util.List;

public interface ICoursService {
    List<Cours> retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);
    void remove(Long id);
}
