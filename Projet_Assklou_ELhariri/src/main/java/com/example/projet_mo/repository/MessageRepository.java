package com.example.projet_mo.repository;

import com.example.projet_mo.model.Log;
import com.example.projet_mo.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
