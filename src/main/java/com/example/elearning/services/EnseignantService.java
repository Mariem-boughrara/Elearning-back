package com.example.elearning.services;



import java.util.List;

import com.example.elearning.entities.Enseignant;
import com.example.elearning.entities.Utilisateur;


public interface EnseignantService {

	public Enseignant addEnseignant(Enseignant a);
	public void  deleteEnseignant(int id);
	public Utilisateur getById(int id);
	public List<Utilisateur>getAllUtilisateurs();
	public Enseignant update(Enseignant a);
	public Utilisateur getByInfo(String email, String password);
}

