package com.example.projet_mo.service;

import com.example.projet_mo.model.Etudiant;
import com.example.projet_mo.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceEtudiant {
@Autowired
    EtudiantRepository etudiantRepository;

    public List<Etudiant> getAllEtudiant(){
        return etudiantRepository.findAll();
    }
    public Optional<Etudiant> getEtudiant(long id){
        return etudiantRepository.findById(id);
    }

    public Etudiant saveEtudiant(Etudiant etudiant) {
        Etudiant savedetudiant = etudiantRepository.save(etudiant);
        return savedetudiant;
    }
}
