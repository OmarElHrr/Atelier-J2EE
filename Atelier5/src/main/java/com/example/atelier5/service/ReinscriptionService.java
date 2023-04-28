package com.example.atelier5.service;

import com.example.atelier5.model.Etudiant;
import com.example.atelier5.model.Reinscription;
import com.example.atelier5.repository.EtudiantRepository;
import com.example.atelier5.repository.ReinscriptionRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class ReinscriptionService {
    @Autowired
    private ReinscriptionRepository reinscriptionRepository;

    public Reinscription saveReinscription(Reinscription reinscription) {
        Reinscription savedreinscription = reinscriptionRepository.save(reinscription);
        return savedreinscription;
    }
}
