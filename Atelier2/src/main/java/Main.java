import modul.Etudiant;
import service.Etudiantservice;
import service.Reinscriptionsevice;
import Hibernate.HibernateUtil;
import modul.Reinscription;
import org.hibernate.Session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {

    public static void main(String[] args) {


       //  qst 6
   /*  List<Etudiant> list = Etudiantservice.create();
        Etudiantservice.persistEtudiants(list);*/

        // qst 7
      //Etudiantservice.afficher();

        // qst 8
       /*  List<Reinscription> reinscriptions = Reinscriptionsevice.create_Reinscription();
        Reinscriptionsevice.PersistReinscription(reinscriptions);
        Reinscriptionsevice.afficher_Reinscription(2);*/


         // qst 9
       // Etudiantservice.deleteEtudiant(1);

        //qst 10
      //Etudiantservice.updateEtudiant(3,"ikram",  "ikram", "bk1235");


        // qst 11
        Etudiantservice.afficherEtudiantsParNiveau("3");
    }
}