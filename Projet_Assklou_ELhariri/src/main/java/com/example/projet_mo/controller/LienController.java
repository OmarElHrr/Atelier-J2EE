package com.example.projet_mo.controller;

import com.example.projet_mo.model.Batiment;
import com.example.projet_mo.model.Log;
import com.example.projet_mo.service.ServiceBatiment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Controller
public class LienController {
    @Autowired
    ServiceBatiment serviceBatiment;
    @GetMapping("/home")
    public String home1( Model model){
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
    @GetMapping("/contact")
    public String contact()
    {
        return "contact";
    }

}
