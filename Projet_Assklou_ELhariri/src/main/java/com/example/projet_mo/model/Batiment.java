package com.example.projet_mo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Batiment")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
public class Batiment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nom;
    @Column
    private String adresse;
    @Column
    private String telephone;
    @Column
    private String email;
    @Column
    private String description;
    @Column
    private int heureOuverture;
    @Column
    private int heureFermeture;
    @Column
    private String logo;
    @Column
    private String image1;
    @Column
    private String image2;
    @Column
    private String image3;
    @Column
    private String image4;
    @Column
    private String image5;


    @ElementCollection
    private List<String> joursTravail;
}
