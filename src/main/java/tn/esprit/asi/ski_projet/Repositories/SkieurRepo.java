package tn.esprit.asi.ski_projet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.asi.ski_projet.Entities.Skieur;


import java.util.List;
@Repository
public interface SkieurRepo  extends JpaRepository<Skieur,Long> {


}
