package com.model;

public class Inscription {
    public Etudiant etudiant;
    public String date_inscription;
    public String filier;
    public String groupe;
    public String niveau;
    public String cycle;
    public int nombre_annees;

    public Inscription() {
    }

    public Inscription(Etudiant etudiant, String date_inscription, String filier, String groupe, String niveau, String cycle, int nombre_annees) {
        this.etudiant = etudiant;
        this.date_inscription = date_inscription;
        this.filier = filier;
        this.groupe = groupe;
        this.niveau = niveau;
        this.cycle = cycle;
        this.nombre_annees = nombre_annees;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public String getDate_inscription() {
        return date_inscription;
    }

    public void setDate_inscription(String date_inscription) {
        this.date_inscription = date_inscription;
    }

    public String getFilier() {
        return filier;
    }

    public void setFilier(String filier) {
        this.filier = filier;
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

    public int getNombre_annees() {
        return nombre_annees;
    }

    public void setNombre_annees(int nombre_annees) {
        this.nombre_annees = nombre_annees;
    }
}
