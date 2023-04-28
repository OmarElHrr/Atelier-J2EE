package com.example.atelier5.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Etudiant")
public class Etudiant   {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "cin")
    private String cin;
    @Column(name = "date_de_naissance")
    private String date_de_naissance;
    @Column(name = "tele")
    private String tele;
    @Column(name = "mail")
    private String mail;
    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reinscription> reinscriptionList;



}