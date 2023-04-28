package com.example.projet_mo.service;

import com.example.projet_mo.model.Cafeteria;
import com.example.projet_mo.repository.CafeteriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCafeteria {
    @Autowired
    CafeteriaRepository cafeteriaRepository;

    public List<Cafeteria> getAllCafeteria(){
        return cafeteriaRepository.findAll();
    }
    public Optional<Cafeteria> getCafeteria(long id){
        return cafeteriaRepository.findById(id);
    }
}
