package pe.cibertec.CL2_DAW1_VIDAL_VIVANCO_PAUL_ANDRE.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer languageId;
    private String name;
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private language language;
}
