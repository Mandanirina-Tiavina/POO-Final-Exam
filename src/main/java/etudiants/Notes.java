package etudiants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@AllArgsConstructor
@Getter

public class Notes {
    private float notes;
    private Cours cours;
    private Instant date;
    private String description;


}
