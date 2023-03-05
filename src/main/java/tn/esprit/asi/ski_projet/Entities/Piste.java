package tn.esprit.asi.ski_projet.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numPiste;
    String nomPiste;
    @Enumerated(EnumType.STRING)
    Couleur couleur;
    Integer longeur;
    Integer Pente;
    @JsonIgnore
    @ManyToMany(mappedBy = "pistes",cascade = CascadeType.REMOVE)
    Set<Skieur>skieurs;


}
