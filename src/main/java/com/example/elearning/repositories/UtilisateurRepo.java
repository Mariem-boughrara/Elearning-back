package com.example.elearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.elearning.entities.Utilisateur;

public interface UtilisateurRepo extends JpaRepository<Utilisateur, Integer> {

	@Query("SELECT u FROM Utilisateur u WHERE user_email= :email AND user_pass= :password ")
	public Utilisateur getByInfo(@Param(value = "email") String email,@Param(value = "password") String password);

}