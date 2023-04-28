package com.example.projet_mo.controller;

import com.example.projet_mo.model.*;
import com.example.projet_mo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


import java.util.List;
import java.util.Optional;

@Controller
public class MenuController {

    @Autowired
    private ServiceCoaching_centre serviceCoaching_centre;
    @Autowired
    private ServiceEtablissement serviceEtablissement;
    @Autowired
    private ServiceCafeteria serviceCafeteria;
    @Autowired
    private ServiceBibliotheque serviceBibliotheque;
    @GetMapping("/Etablissements")
    public String return_eta(Model model){
        List<Etablissement> etab = serviceEtablissement.getAllEtablissement();
        String img ;
        for (Batiment b : etab){
            img = b.getLogo();
            img="images/"+img;
            b.setLogo(img);
        }
        String lien;
        for (Batiment b : etab){
            lien = "pres";
            lien="/"+lien;
            b.setImage2(lien);
            System.out.println(b.getImage2());
        }
        String imageSrc = "category/ecole.jpg";
        String cate = "Etablissements";
        model.addAttribute("imageSrc", imageSrc);
        model.addAttribute("cate",cate);
        model.addAttribute("batiment", etab);
        return "menu_2";
    }

    @GetMapping("/Bibliotheque")
    public String return_bib(Model model1){
        List<Bibliotheque> bib = serviceBibliotheque.getAllBibliotheque();
        String img ;
        for (Batiment b : bib){
            img = b.getLogo();
            img="images/"+img;
            b.setLogo(img);
        }
        String lien;
        for (Batiment b : bib){
            lien = "pres";
            lien="/"+lien;
            b.setImage2(lien);
            System.out.println(b.getImage2());
        }
        String imageSrc = "category/bib.jpg";
        String cate = "Bibliotheque";
        model1.addAttribute("imageSrc", imageSrc);
        model1.addAttribute("cate",cate);
        model1.addAttribute("batiment", bib);
        return "menu_2";
    }

    @GetMapping("/espaces_travail")
    public String return_Cafe(Model model){
        List<Cafeteria> cafe = serviceCafeteria.getAllCafeteria();
        String img ;
        for (Batiment b : cafe){
            img = b.getLogo();
            img="images/"+img;
            b.setLogo(img);
        }
        String lien;
        for (Batiment b : cafe){
            lien = "pres";
            lien="/"+lien;
            b.setImage2(lien);
            System.out.println(b.getImage2());
        }
        String imageSrc = "category/cafe.jpg";
        String cate = "Les espaces de travail";
        model.addAttribute("imageSrc", imageSrc);
        model.addAttribute("cate",cate);
        model.addAttribute("batiment", cafe);
        return "menu_2";
    }

    @GetMapping("/centres_coaching")
    public String return_centres(Model model){
        List<Coaching_centre> centres = serviceCoaching_centre.getAllCoaching_centre();
        String img ;
        for (Batiment b : centres){
            img = b.getLogo();
            img="images/"+img;
            b.setLogo(img);
        }
        String lien;
        for (Batiment b : centres){
            lien = "pres";
            lien="/"+lien;
            b.setImage2(lien);
            System.out.println(b.getImage2());
        }
        String imageSrc = "category/coching.jpg";
        String cate = "Les centres de coaching";
        model.addAttribute("imageSrc", imageSrc);
        model.addAttribute("cate",cate);
        model.addAttribute("batiment", centres);
        return "menu_2";
    }




}
