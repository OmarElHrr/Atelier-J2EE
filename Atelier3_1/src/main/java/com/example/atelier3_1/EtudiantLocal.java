package com.example.atelier3_1;


import jakarta.ejb.Local;
import modul.Etudiant;

@Local
public interface EtudiantLocal {
     public Etudiant creatEtudiant(String nom, String prenom, String Date_nais, String CIN, String tele, String mail);
     void ajouterEtudiant(Etudiant etudiant);
}
