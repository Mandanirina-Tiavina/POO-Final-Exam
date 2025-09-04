package etudiants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@Getter

public class Cours {
    private String id;
    private String label;
    private float credit;
    private Enseignants enseignant;
    private List<Notes> notes;

    public double getCourseGrade(Cours cours, Etudiants etudiant, Instant t) {
        var noteTotal = 0.0;
        for (Notes note : notes) {
            noteTotal += note.getNotes();
        }
        return noteTotal;
    }
}
