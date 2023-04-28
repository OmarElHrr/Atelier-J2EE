package com.example.projet_mo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="etudiant" )
@DiscriminatorValue("etudiant")
@Data
@NoArgsConstructor
public class Etudiant extends Utilisateur {
    @Column
    private String CNE;

    @Column
    private String groupe;

    @Column
    private int niveau;

    @ManyToOne
    @JoinColumn(name = "formation_id")
    private Formation formation;

    @ManyToOne
    @JoinColumn(name = "etablissement_id")
    private Etablissement etablissement;

}
