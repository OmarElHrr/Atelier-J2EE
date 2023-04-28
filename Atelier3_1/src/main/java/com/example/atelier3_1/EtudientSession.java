package com.example.atelier3_1;

import jakarta.ejb.Local;
import jakarta.ejb.Stateful;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import modul.Etudiant;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Local
@Stateful
public class EtudientSession  implements EtudiantLocal{
    public Etudiant creatEtudiant(String nom, String prenom, String DatedeNaissance, String CIN, String tele, String mail){
        Etudiant etudiant = new Etudiant();
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
        etudiant.setDatedeNaissance(DatedeNaissance);
        etudiant.setCIN(CIN);
        etudiant.setTele(tele);
        etudiant.setMail(mail);
        return etudiant;
    }



    @Override
    public void ajouterEtudiant(Etudiant etudiant) {
            Session session = HibernateUtil.getSession();
            Transaction transaction = session.beginTransaction();


                try {
                    session.save(etudiant);
                    transaction.commit();

                    System.out.println("Identifiant ajouté avec succès!");
                } catch (Exception e) {
                    transaction.rollback();
                    e.printStackTrace();
                } finally {
                    session.close();
                }
            }
        }



