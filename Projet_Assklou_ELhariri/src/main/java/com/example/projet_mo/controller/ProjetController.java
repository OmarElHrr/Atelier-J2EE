package com.example.projet_mo.controller;

import com.example.projet_mo.model.Etablissement;
import com.example.projet_mo.model.Formation;
import com.example.projet_mo.service.ServiceEtablissement;
import com.example.projet_mo.service.ServiceFormation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProjetController {
    @Autowired
    private ServiceEtablissement serviceEtablissement;

    @Autowired
    private ServiceFormation serviceFormation;


    @GetMapping("/")
    public String home() {
        return "index";
    }


    @GetMapping("/signup")
    public String showSignupForm(Model model) {
        List<Etablissement> etablissements = serviceEtablissement.getAllEtablissement();
        List<Formation> formations = serviceFormation.getAllFormation();
        model.addAttribute("etablissements", etablissements);
        model.addAttribute("formations",formations);
        return "inscription";
    }
}
