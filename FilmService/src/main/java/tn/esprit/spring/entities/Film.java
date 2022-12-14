package tn.esprit.spring.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="FILM")
public class Film implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomFilm;
    private String description;
    private double duree;
    @Temporal(TemporalType.DATE)
    private Date dateSortie;

   /* @OneToMany(cascade = CascadeType.ALL,mappedBy="film")
    @JsonIgnore
    private Set<Realisateur> realisateurs;
    */
    private String acteurs;
    /*@ManyToOne
    @JoinColumn(name="FK_Cat_ID")
    @JsonIgnore
    private CategorieFilm categorieFilm;
*/
    @Enumerated(EnumType.STRING)
    private CategorieFilm categorieFilm;

}
