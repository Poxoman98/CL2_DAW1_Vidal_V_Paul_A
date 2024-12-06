package pe.cibertec.CL2_DAW1_VIDAL_VIVANCO_PAUL_ANDRE.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmActor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer actorId;
    private Integer filmId;
    private Date last_update;

}
