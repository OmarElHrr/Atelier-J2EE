package service;

import Hibernate.HibernateUtil;
import modul.Etudiant;
import modul.Reinscription;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import java.util.ArrayList;
import java.util.List;

public class Reinscriptionsevice {

    public static List<Reinscription> create_Reinscription(){
        List<Reinscription> reinscription = new ArrayList<>();

        Etudiant etudiant1 = new Etudiant();
        etudiant1.setId(2);
        etudiant1.setCIN("ID111111");
        etudiant1.setNom("Kenzaoui");
        etudiant1.setPrenom("yassine");


        Reinscription reinscription0 = new Reinscription();
        reinscription0.setEtudiant(etudiant1);
        reinscription0.setCycle("2eme");
        reinscription0.setGroupe("2");
        reinscription0.setDate_re("13/10/2019");
        reinscription0.setNiveau("3");
        reinscription.add(reinscription0);

        Reinscription reinscription1 = new Reinscription();
        reinscription1.setEtudiant(etudiant1);
        reinscription1.setCycle("3eme");
        reinscription1.setGroupe("3");
        reinscription1.setDate_re("13/10/2020");
        reinscription1.setNiveau("4");
        reinscription.add(reinscription1);

        return reinscription;
    }
    public static void PersistReinscription(List<Reinscription> reinscriptions) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();

            for (Reinscription reinscription : reinscriptions) {
                session.save(reinscription);
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
    public static void afficher_Reinscription(long etudiantId){
        // Utilisation de la classe pour récupérer les formations d'un étudiant donné
        Session session = HibernateUtil.getSession();
        Etudiant etudiant = session.get(Etudiant.class, etudiantId);
        List<Reinscription> reinscriptions = etudiant.getReinscriptionList();
        for (Reinscription reinscription : reinscriptions) {
            System.out.println(reinscription);
        }
        session.close();

    }
}
