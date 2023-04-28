package modul;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "etudiant")
public class Etudiant  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "CIN")
    private String CIN;
    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reinscription> reinscriptionList;

    public Etudiant() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public List<Reinscription> getReinscriptionList() {
        return reinscriptionList;
    }

    public void setReinscriptionList(List<Reinscription> reinscriptionList) {
        this.reinscriptionList = reinscriptionList;
    }

    public Etudiant(String nom, String prenom, String CIN, List<Reinscription> reinscriptionList) {
        this.nom = nom;
        this.prenom = prenom;
        this.CIN = CIN;
        this.reinscriptionList = reinscriptionList;
    }
    public void addReinscription(Reinscription reinscription) {
        this.reinscriptionList.add(reinscription);
        reinscription.setEtudiant(this);
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", CIN='" + CIN + '\'' +
                "}";
    }
}
