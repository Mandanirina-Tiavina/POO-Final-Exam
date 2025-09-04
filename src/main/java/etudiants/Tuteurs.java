package etudiants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
@AllArgsConstructor
@Getter

public class Tuteurs {
    private String id;
    private String nom;
    private String prenom;
    private Date dateDeNaissance;
    private String email;
    private String numero;
    private String description;
}
