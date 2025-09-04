package etudiants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter

public class Examens {
    private String id;
    private String titre;
    private Cours cours;
    private Date date;
    private float coefficient;

}
