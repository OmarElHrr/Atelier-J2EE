package com.example.atelier3_1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

        static SessionFactory factory = null ;
        //If you have your hibernate.cfg.xml in the root of the source folder, just do
        //SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        //If it is in the package, for an example in the org.nitish.caller, specify path by this way
        // SessionFactory sessionFactory = new Configuration() .configure("/org/nitish/caller/hibernate.cfg.xml").buildSessionFactory();

        //static bloc
        static {
        Configuration cfg = new Configuration() ;
        cfg.configure("hibernate.cfg.xml");
        factory = cfg.buildSessionFactory();
    }

        public static SessionFactory getSessionFactory() {
        return factory ;
    }

        public static Session getSession() {
        return factory.openSession() ;
    }
}
