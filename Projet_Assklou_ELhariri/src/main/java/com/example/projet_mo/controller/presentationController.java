package com.example.projet_mo.controller;

import com.example.projet_mo.model.Batiment;
import com.example.projet_mo.model.Etablissement;
import com.example.projet_mo.service.ServiceBatiment;
import com.example.projet_mo.service.ServiceEtablissement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import java.util.Optional;

@Controller
public class presentationController {
    @Autowired
    ServiceEtablissement serviceEtablissement;

    @Autowired
    ServiceBatiment serviceBatiment;



    @GetMapping("/pres")
    public String handleMyUrl(@RequestParam("id") long id ,  Model model) {
        Optional<Batiment> batiment = serviceBatiment.getBatiment(id);
         Batiment batiment_1;
        String[] jours ;
        if (batiment.isPresent() ) {
            batiment_1 = batiment.get();
            batiment_1.setLogo("images/"+batiment_1.getLogo());
            batiment_1.setImage1("images/"+batiment_1.getImage1());
            batiment_1.setImage2("images/"+batiment_1.getImage2());
            batiment_1.setImage3("images/"+batiment_1.getImage3());
            batiment_1.setImage4("images/"+batiment_1.getImage4());
            batiment_1.setImage5("images/"+batiment_1.getImage5());
            model.addAttribute("etablissemet", batiment_1);
            return "presentation";
        }
        return "menu_2";
    }
}
