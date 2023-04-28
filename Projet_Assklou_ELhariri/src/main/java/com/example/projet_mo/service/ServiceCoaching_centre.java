package com.example.projet_mo.service;

import com.example.projet_mo.model.Coaching_centre;
import com.example.projet_mo.repository.Coaching_centreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCoaching_centre {
    @Autowired
    Coaching_centreRepository coachingCentreRepository;

    public List<Coaching_centre> getAllCoaching_centre(){
        return coachingCentreRepository.findAll();
    }
    public Optional<Coaching_centre> getCoaching_centre(long id){
        return coachingCentreRepository.findById(id);
    }
}
