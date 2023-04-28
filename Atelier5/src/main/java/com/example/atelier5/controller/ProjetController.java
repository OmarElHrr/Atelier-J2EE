package com.example.atelier5.controller;


import org.springframework.ui.Model;
import com.example.atelier5.model.Etudiant;
import com.example.atelier5.model.Reinscription;
import com.example.atelier5.service.EtudiantService;
import com.example.atelier5.service.ReinscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProjetController {

            @GetMapping("/")
            public String home() {
                return "index";
            }

    @Autowired
    private EtudiantService etudiantService;

    @Autowired
    private ReinscriptionService reinscriptionService;

    @PostMapping("/registrer")
    public String creerEtudiantEtFormation(@RequestParam String nom, @RequestParam String prenom, @RequestParam String cin, @RequestParam String date_naissance,
                                           @RequestParam String email,@RequestParam String tel,@RequestParam String date_inscription,@RequestParam String filier,
                                           @RequestParam String cycle,@RequestParam String niveau,@RequestParam String groupe,@RequestParam String nombre_annees,Model model) {

        nombre_annees = (nombre_annees == null || nombre_annees.isEmpty()) ? "0" : nombre_annees;

        Etudiant etudiant = new Etudiant();
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
        etudiant.setCin(cin);
        etudiant.setDate_de_naissance(date_naissance);
        etudiant.setMail(email);
        etudiant.setTele(tel);

        etudiantService.saveEtudiant(etudiant);

        Reinscription reinscription = new Reinscription();
        reinscription.setEtudiant(etudiant);
        reinscription.setCycle(cycle);
        reinscription.setGroupe(groupe);
        reinscription.setNiveau(niveau);
        reinscription.setDate_re(date_inscription);
        reinscription.setNombre_annees(Integer.parseInt(nombre_annees));
        reinscription.setFilier(filier);


       reinscriptionService.saveReinscription(reinscription);

        model.addAttribute("etudiant", etudiant);
        model.addAttribute("reinscription", reinscription);

        return "affichage";
    }
}
