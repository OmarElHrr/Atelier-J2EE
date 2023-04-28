package com.example.projet_mo.service;

import com.example.projet_mo.model.Log;
import com.example.projet_mo.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceLog {
@Autowired
    LogRepository logRepository;

    public List<Log> getAllLog(){
        return logRepository.findAll();
    }
    public Optional<Log> getLog(long id){
        return logRepository.findById(id);
    }
    public Log saveLog(Log log) {
        Log savedlog = logRepository.save(log);
        return savedlog;
    }
}
