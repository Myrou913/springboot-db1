package com.example.springbootdb1.repository;

import com.example.springbootdb1.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    Utilisateur findByNom(String nom);
}