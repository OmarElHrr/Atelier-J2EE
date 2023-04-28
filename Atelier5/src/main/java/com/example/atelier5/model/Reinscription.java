package com.example.atelier5.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reinscription")
public class Reinscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private long id;
    @Column(name = "date_re")
    private String date_re;
    @Column(name = "groupe")
    private String  groupe;
    @Column(name = "niveau")
    private String niveau;
    @Column(name = "cycle")
    private String cycle;
    @Column(name = "filier")
    private String filier;
    @Column(name = "nombre_annees")
    private int nombre_annees;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_etudiant", referencedColumnName = "id")
    private Etudiant etudiant;

    public Reinscription(String date_re, String groupe, String niveau, String cycle, String filier, int nombre_annees, Etudiant etudiant) {
        this.date_re = date_re;
        this.groupe = groupe;
        this.niveau = niveau;
        this.cycle = cycle;
        this.etudiant = etudiant;
        this.nombre_annees=nombre_annees;
        this.filier=filier;
    }

    public String getFilier() {
        return filier;
    }

    public void setFilier(String filier) {
        this.filier = filier;
    }

    public int getNombre_annees() {
        return nombre_annees;
    }

    public void setNombre_annees(int nombre_annees) {
        this.nombre_annees = nombre_annees;
    }

    public Reinscription() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate_re() {
        return date_re;
    }

    public void setDate_re(String date_re) {
        this.date_re = date_re;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    @Override
    public String toString() {
        return "Reinscription{" +
                "id=" + id +
                ", date_re='" + date_re + '\'' +
                ", groupe='" + groupe + '\'' +
                ", niveau='" + niveau + '\'' +
                ", cycle='" + cycle + '\'' +
                ", etudiant=" + etudiant +
                '}';
    }
}
