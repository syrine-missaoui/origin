package tn.esprit.asi.ski_projet.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.asi.ski_projet.Entities.Inscription;

@Repository
public interface InscriptionRepo extends JpaRepository <Inscription,Long> {
}
