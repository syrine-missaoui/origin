package tn.esprit.asi.ski_projet.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Abonnement extends Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numAbon;
    LocalDate dateDebut;
    LocalDate dateFin;
    Float prixAbon;
    @Enumerated(EnumType.STRING)
    TypeAbonnement typeAbonnement;




}
