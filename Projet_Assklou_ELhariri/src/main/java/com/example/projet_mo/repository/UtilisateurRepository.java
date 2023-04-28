package com.example.projet_mo.repository;

import com.example.projet_mo.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository  extends JpaRepository<Utilisateur,Long> {
}
