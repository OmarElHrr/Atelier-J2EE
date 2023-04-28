package modul;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "DatedeNaissance")
    private String DatedeNaissance;
    @Column(name = "CIN")
    private String CIN;
    @Column(name = "telephone")
    private String tele;
    @Column(name = "mail")
    private String mail;

    public Etudiant() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDatedeNaissance(String datedeNaissance) {
        DatedeNaissance = datedeNaissance;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDatedeNaissance() {
        return DatedeNaissance;
    }

    public String getCIN() {
        return CIN;
    }

    public String getTele() {
        return tele;
    }

    public String getMail() {
        return mail;
    }



}
