package com.example.projet_mo.controller;


import com.example.projet_mo.model.Message;
import com.example.projet_mo.model.Utilisateur;
import com.example.projet_mo.service.ServiceMessage;
import com.example.projet_mo.service.ServiceUtilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MessageContoller {
    @Autowired
    ServiceMessage serviceMessage;
    @Autowired
    ServiceUtilisateur serviceUtilisateur;
    @PostMapping("/message")
    public String save_message(@RequestParam String name, @RequestParam String email, @RequestParam String message ){
        List<Utilisateur> utilisateurs = serviceUtilisateur.getAllUtilisateur();
        Message message_obg = new Message();
        for(Utilisateur u : utilisateurs){
            if (u.getEmail().equalsIgnoreCase(email) ){
                message_obg.setUtilisateur(u);
                message_obg.setMessage(message);
                serviceMessage.saveMessage(message_obg);
                break;
            }
        }
        return "contact";
    }
}
