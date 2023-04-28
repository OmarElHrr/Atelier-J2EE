package com.example.projet_mo.service;

import com.example.projet_mo.model.Utilisateur;
import com.example.projet_mo.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceUtilisateur {
@Autowired
    UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> getAllUtilisateur(){
        return utilisateurRepository.findAll();
    }
    public Optional<Utilisateur> getUtilisateur(long id){
        return utilisateurRepository.findById(id);
    }
}
