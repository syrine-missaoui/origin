package tn.esprit.asi.ski_projet.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.asi.ski_projet.Entities.Abonnement;

@Repository
public interface AbonnementRepo extends JpaRepository<Abonnement,Long> {
}

