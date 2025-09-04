package etudiants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;
import java.util.Comparator;
import java.util.List;

@AllArgsConstructor
@Getter

public class Etudiants {
    private String id;
    private String nom;
    private String prenom;
    private Instant dateDeNaissance;
    private String email;
    private String numero;
    private Tuteurs tuteurs;
    private List<Notes> notes;

    public double getExamGrade(Examens examen, Etudiants etudiant, Instant t) {
        return notes.stream()
                .filter(notes -> notes.getDate().isBefore(t))
                .max(Comparator.comparing(Notes::getDate))
                .map(Notes::getNotes)
                .get();
    }
}
