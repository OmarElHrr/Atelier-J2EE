package com.example.projet_mo.controller;

import com.example.projet_mo.model.Batiment;
import com.example.projet_mo.model.Log;
import com.example.projet_mo.service.ServiceBatiment;
import com.example.projet_mo.service.ServiceLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private ServiceLog serviceLog;

    @Autowired
    private ServiceBatiment serviceBatiment;
    @PostMapping("/login")
    public String log_in(@RequestParam String nom_utilisateur, @RequestParam String mot_de_pass, Model model){
        List<Log> logs = serviceLog.getAllLog();
        for(Log log : logs) {
            if(log.getNom_utilisateur().equalsIgnoreCase(nom_utilisateur) && log.getMote_de_passe().equals(mot_de_pass)) {
                LocalDate currentDate = LocalDate.now();
                Date currentDateAsDate = java.sql.Date.valueOf(currentDate);
                log.setDerniere_connexion(currentDateAsDate);
                serviceLog.saveLog(log);

                List<Batiment> batiments = serviceBatiment.getAllBatiment();
                String html = "";

                for (Batiment  batiment : batiments) {
                    html += "<div class=\"slider-item\">" +
                            "<div class=\"slider-item-content\">" +
                            "<div class=\"post-thumb mb-4\">" +
                            "<a href=\"#\">" +
                            "<img src=\"images/" + batiment.getImage1() + "\" alt=\"\" class=\"img-fluid\">" +
                            "</a>" +
                            "</div>" +
                            "<div class=\"slider-post-content\">" +
                            "<span class=\"cat-name text-color font-sm font-extra text-uppercase letter-spacing\">" + batiment.getNom() + "</span>" +
                            "<h3 class=\"post-title mt-1\"><a href=\"#\">" + batiment.getNom() + "</a></h3>" +
                            "<span class=\" text-muted  text-capitalize\">" + batiment.getNom() + "</span>" +
                            "</div>" +
                            "</div>" +
                            "</div>";
                }
                model.addAttribute("sliderItems", html);
                return "menu_1";
            }
        }
        return "index";
    }


}
