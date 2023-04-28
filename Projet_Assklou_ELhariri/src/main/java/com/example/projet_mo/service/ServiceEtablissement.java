package com.example.projet_mo.service;

import com.example.projet_mo.model.Etablissement;
import com.example.projet_mo.repository.EtablissementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceEtablissement {
    @Autowired
    EtablissementRepository etablissementRepository;


    public  List<Etablissement> getAllEtablissement(){
        return etablissementRepository.findAll();
    }
    public Optional<Etablissement> getEtablissement(long id){
        return etablissementRepository.findById(id);
    }
}
