package com.example.elearning.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.elearning.entities.Utilisateur;

public interface UtilisateurService {

	public Utilisateur addUser(Utilisateur a);
	public void  deleteUser(int id);
	public Utilisateur getById(int id);
	public List<Utilisateur>getAllUser();
	public Utilisateur update(Utilisateur a);
	public Utilisateur getByInfo(String email, String password);
}

