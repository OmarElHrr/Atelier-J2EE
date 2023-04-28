package com.example.projet_mo.service;

import com.example.projet_mo.model.Bibliotheque;
import com.example.projet_mo.repository.BibliothequeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceBibliotheque {
    @Autowired
    BibliothequeRepository bibliothequeRepository;

    public List<Bibliotheque> getAllBibliotheque(){
        return bibliothequeRepository.findAll();
    }
    public Optional<Bibliotheque> getBibliotheque(long id){
        return bibliothequeRepository.findById(id);
    }}
