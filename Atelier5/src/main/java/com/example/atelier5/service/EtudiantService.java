package com.example.atelier5.service;

import com.example.atelier5.model.Etudiant;
import com.example.atelier5.repository.EtudiantRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class EtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;

    public Etudiant saveEtudiant(Etudiant etudiant) {
        Etudiant savedetudiant = etudiantRepository.save(etudiant);
        return savedetudiant;
    }
}