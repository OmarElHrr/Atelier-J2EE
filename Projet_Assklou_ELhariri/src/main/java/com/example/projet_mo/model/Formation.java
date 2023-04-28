package com.example.projet_mo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "formation")
@Data
@NoArgsConstructor
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column
    private String nom;
    @Column
    private String description;
    @Column
    private int duree;

    @ManyToOne
    @JoinColumn(name = "etablissement_id")
    private Etablissement etablissement;

    @OneToMany(mappedBy = "formation")
    private List<Etudiant> etudiants;
}
