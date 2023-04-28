package service;

import Hibernate.HibernateUtil;
import modul.Etudiant;
import modul.Reinscription;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import java.util.ArrayList;
import java.util.List;

public class Etudiantservice {
    public static List<Etudiant> create(){
        List<Etudiant> etudiants = new ArrayList<>();

        Etudiant etudiant0 = new Etudiant();

        etudiant0.setId(44);
        etudiant0.setCIN("ID000000");
        etudiant0.setNom("el hariri");
        etudiant0.setPrenom("omar");
        etudiants.add(etudiant0);

        Etudiant etudiant1 = new Etudiant();
        etudiant1.setCIN("ID111111");
        etudiant1.setNom("Kenzaoui");
        etudiant1.setPrenom("yassine");
        etudiants.add(etudiant1);

        Etudiant etudiant2 = new Etudiant();
        etudiant2.setCIN("ID222222");
        etudiant2.setNom("Makhass");
        etudiant2.setPrenom("hamza");
        etudiants.add(etudiant2);

        Etudiant etudiant3 = new Etudiant();
        etudiant3.setCIN("ID33333");
        etudiant3.setNom("el khabar");
        etudiant3.setPrenom("Mouad");
        etudiants.add(etudiant3);

        return etudiants;
    }
    public static void persistEtudiants(List<Etudiant> etudiants) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();

            for (Etudiant etudiant : etudiants) {
                session.save(etudiant);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && !transaction.getStatus().equals(TransactionStatus.COMMITTED)) {
                try {
                    if (transaction.getStatus().equals(TransactionStatus.ACTIVE)) {
                        transaction.rollback();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        }

    }
    public static void deleteEtudiant(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();

            Etudiant etudiant = session.get(Etudiant.class, id);
            if (etudiant != null) {
                session.delete(etudiant);
                transaction.commit();
                System.out.println("Etudiant avec ID " + id + " a été supprimé");
            } else {
                System.out.println("Etudiant avec ID " + id + " n'a pas été trouvé");
            }
        } catch (Exception e) {
            if (transaction != null && !transaction.getStatus().equals(TransactionStatus.COMMITTED)) {
                try {
                    if (transaction.getStatus().equals(TransactionStatus.ACTIVE)) {
                        transaction.rollback();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        }
    }
    public static void afficherEtudiantsParNiveau(String niveau) {
        List<Etudiant> etudiants = null;
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            String jpql = "SELECT r.etudiant FROM Reinscription r WHERE r.niveau = :niveau";
            etudiants = session.createQuery(jpql, Etudiant.class)
                    .setParameter("niveau", niveau)
                    .getResultList();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && !transaction.getStatus().equals(TransactionStatus.COMMITTED)) {
                try {
                    if (transaction.getStatus().equals(TransactionStatus.ACTIVE)) {
                        transaction.rollback();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        }

        if (etudiants != null && !etudiants.isEmpty()) {
            System.out.println("Liste des étudiants dont le niveau est " + niveau + " :");
            for (Etudiant etudiant : etudiants) {
                System.out.println(etudiant.getNom() + " " + etudiant.getPrenom());
            }
        } else {
            System.out.println("Aucun étudiant trouvé dont le niveau est " + niveau + ".");
        }
    }



    public static void updateEtudiant(long id, String nom, String prenom, String cin) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();

            Etudiant etudiant = session.get(Etudiant.class, id);
            if (etudiant != null) {
                etudiant.setNom(nom);
                etudiant.setPrenom(prenom);
                etudiant.setCIN(cin);
                session.update(etudiant);
                transaction.commit();
                System.out.println("Etudiant avec ID " + id + " a été modifier");
            } else {
                System.out.println("Etudiant avec ID " + id + " n'a pas été trouvé");
            }
        } catch (Exception e) {
            if (transaction != null && !transaction.getStatus().equals(TransactionStatus.COMMITTED)) {
                try {
                    if (transaction.getStatus().equals(TransactionStatus.ACTIVE)) {
                        transaction.rollback();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        }
    }


    public static void afficher() {
        try (Session session = HibernateUtil.getSession()) {

            List<Etudiant> etudiants = session.createQuery("FROM Etudiant", Etudiant.class).getResultList();
            // Affichage de la liste des étudiants
            for (Etudiant etudiant : etudiants) {
                System.out.println(etudiant.getNom() + " " + etudiant.getPrenom());
            }
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
