package com.example.elearning.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.elearning.entities.Enseignant;
import com.example.elearning.entities.Utilisateur;
import com.example.elearning.repositories.UtilisateurRepo;
import com.example.elearning.services.EnseignantService;


@Service
public class EnseignantServiceImpl implements EnseignantService{

	@Autowired
	private UtilisateurRepo userRepo;
	public Enseignant addEnseignant(Enseignant a) {
		return this.userRepo.save(a);		
	}
	public void  deleteEnseignant(int id) {
		this.userRepo.deleteById(id);
	}
	public Utilisateur getById(int id) {
		Optional<Utilisateur> user= this.userRepo.findById(id);
		return user.isPresent()?user.get():null;
	}
	public List<Utilisateur>getAllUtilisateurs(){
		return this.userRepo.findAll();
	}
	public Enseignant update(Enseignant a) {
		return this.userRepo.save(a);
	}
	@Override
	public Utilisateur getByInfo(String email, String password) {
		return this.userRepo.getByInfo(email,password);
		
	}
}

