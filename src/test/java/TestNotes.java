import etudiants.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TestNotes {
    private Notes notes;
    private Etudiants etudiants;
    private Cours Prog2;
    private Tuteurs tuteurs;
    private Examens examens;
    @BeforeEach
    void setUp() {
        notes = new Notes(10, Prog2, Instant.parse("2025-01-01T08:00:00Z"), "Moyenne");
        etudiants = new Etudiants("STD24000", "Alice", "Alice", Instant.parse("2000-01-01T08:00:00Z") , "example@mail.com", "0340000000", tuteurs, List.of(notes));
    }
    @Test
    void get_notes_examen_ok() {
        var noteProgExam = etudiants.getExamGrade(examens, etudiants, Instant.parse("2025-01-01T07:00:00Z"));
        var noteProgCours = Prog2.getCourseGrade(Prog2, etudiants, Instant.parse("2025-01-01T08:00:00Z"));

        assertEquals(10,noteProgExam);
        assertEquals(10,noteProgCours);
    }
}
