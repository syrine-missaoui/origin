package tn.esprit.asi.ski_projet.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numSkieur;
    String nomS;
    String prenomS;

    LocalDate dateNaissance;
    String ville;
    @OneToOne
    Abonnement abonnement;
    @ManyToMany
    Set<Piste>pistes;
    @OneToMany(mappedBy = "skieur" , cascade = CascadeType.REMOVE)
    Set<Inscription>inscriptions;
}
