package com.example.elearning.services;


import java.util.List;

import com.example.elearning.entities.Etudiant;
import com.example.elearning.entities.Utilisateur;


public interface EtudiantService {

	public Etudiant addEtudiant(Etudiant a);
	public void  deleteEtudiant(int id);
	public Utilisateur getById(int id);
	public List<Utilisateur>getAllUtilisateurs();
	public Etudiant update(Etudiant a);
	public Utilisateur getByInfo(String email, String password);
}