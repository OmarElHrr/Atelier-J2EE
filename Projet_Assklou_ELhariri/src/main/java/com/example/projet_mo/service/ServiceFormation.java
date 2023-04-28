package com.example.projet_mo.service;

import com.example.projet_mo.model.Formation;
import com.example.projet_mo.repository.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceFormation {
@Autowired
    FormationRepository formationRepository;

    public List<Formation> getAllFormation(){
        return formationRepository.findAll();
    }
    public Optional<Formation> getFormation(long id){
        return formationRepository.findById(id);
    }
}
