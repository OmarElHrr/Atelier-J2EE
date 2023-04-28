package com.example.atelier4;



import jakarta.faces.view.ViewScoped;
import javax.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;


@Named
@ViewScoped
@SessionScoped
public class EtudiantBean implements Serializable {
    protected String nom ;
    protected String prenom ;
    protected String date_de_naissance ;
    protected String cin ;
    protected String tele ;
    protected String mail ;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(String date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String submit(){
        return "affichage";
    }
}
