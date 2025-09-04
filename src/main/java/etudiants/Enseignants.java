package etudiants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
@AllArgsConstructor
@Getter

public class Enseignants {
    private enum Specialite{
        front , back, secu, donne
    }
    private String id;
    private String nom;
    private String prenom;
    private Date dateDeNaissance;
    private String email;
    private String numero;
    private Specialite specialite;

}
