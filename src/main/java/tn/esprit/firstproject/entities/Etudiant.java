package tn.esprit.firstproject.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class Etudiant implements Serializable {
    @Id
    private Integer idEtudiant;
    private String nom;
    @Enumerated(EnumType.STRING)
    private  Option op ;

}
