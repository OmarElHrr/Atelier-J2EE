package com.example.projet_mo.controller;

import ch.qos.logback.core.model.Model;
import com.example.projet_mo.model.*;
import com.example.projet_mo.service.ServiceEtablissement;
import com.example.projet_mo.service.ServiceEtudiant;
import com.example.projet_mo.service.ServiceFormation;
import com.example.projet_mo.service.ServiceLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

@Controller
public class InscriptionController {
    @Autowired
    private ServiceEtablissement serviceEtablissement;
    @Autowired
    private ServiceFormation serviceFormation;
    @Autowired
    private ServiceLog serviceLog;
    @Autowired
    private ServiceEtudiant serviceEtudiant;
    public static String extractName(String input) {
        int index = input.indexOf("@"); // Récupère l'index de la première occurrence de "@"
        String name = input.substring(0, index); // Récupère la sous-chaîne avant l'index de "@"
        return name; // Retourne la chaîne contenant le nom "omar"
    }

    @PostMapping("/registrer")
    public String log_in(@RequestParam String nom, @RequestParam String prenom, @RequestParam String genre, @RequestParam String email,
                         @RequestParam String telephone, @RequestParam String cne, @RequestParam int niveau,
                         @RequestParam Date date_de_naissance, @RequestParam String pass, @RequestParam String adresse, @RequestParam String nationalite,
                         @RequestParam long etablissement, @RequestParam long formation, @RequestParam String groupe) {

        Optional<Etablissement> etablissement1 = serviceEtablissement.getEtablissement(etablissement);
        Optional<Formation> formation1 = serviceFormation.getFormation(formation);

        Etablissement etablissement2 = null;
        Formation formation2 = null;
        if (etablissement1.isPresent() && formation1.isPresent()) {
            etablissement2 = etablissement1.get();
            formation2 = formation1.get();
            // Faites quelque chose avec l'objet Etablissement
        } else {
            System.exit(-1);
        }


        Etudiant etudiant = new Etudiant();
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
        etudiant.setCNE(cne);
        etudiant.setGenre(genre);
        etudiant.setEmail(email);
        etudiant.setTelephone(telephone);
        etudiant.setDate_de_naissance(date_de_naissance);
        etudiant.setNiveau(niveau);
        etudiant.setGroupe(groupe);
        etudiant.setAdresse(adresse);
        etudiant.setNationalite(nationalite);
        LocalDate currentDate = LocalDate.now();
        Date currentDateAsDate = java.sql.Date.valueOf(currentDate);
        etudiant.setDate_inscription(currentDateAsDate);
        etudiant.setEtablissement(etablissement2);
        etudiant.setFormation(formation2);
        String user = extractName(email);
        Log log = new Log();
        log.setNom_utilisateur(user);
        log.setMote_de_passe(pass);
        log.setUtilisateur(etudiant);


        serviceEtudiant.saveEtudiant(etudiant);
        serviceLog.saveLog(log);


        return "index";
    }

}
