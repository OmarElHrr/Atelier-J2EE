package com.example.projet_mo.service;

import com.example.projet_mo.model.Batiment;
import com.example.projet_mo.repository.BatimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceBatiment {
    @Autowired
    BatimentRepository batimentRepository;

    public List<Batiment> getAllBatiment(){
        return batimentRepository.findAll();
    }
    public Optional<Batiment> getBatiment(long id){
        return batimentRepository.findById(id);
    }
}
