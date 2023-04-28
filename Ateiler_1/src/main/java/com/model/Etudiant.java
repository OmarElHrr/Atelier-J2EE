package com.model;

import java.util.Date;

public class Etudiant {
    public String Nom;
    public String Prenom;
    public String Date_de_naissance;
    public String CIN;
    public String Tele;
    public String Mail;

    public Etudiant(String nom, String prenom, String date_de_naissance, String cin, String tele, String mail) {
        this.Nom = nom;
        this.Prenom = prenom;
        this.Date_de_naissance = date_de_naissance;
        this.CIN = cin;
        this.Tele = tele;
        this.Mail = mail;
    }
    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }
    public String getDate_de_naissance() {
        return Date_de_naissance;
    }

    public void setDate_de_naissance(String date_de_naissance) {
        Date_de_naissance = date_de_naissance;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String cin) {
        CIN = cin;
    }
    public String getTele() {
        return Tele;
    }

    public void setTele(String tele) {
        Tele = tele;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }
}
