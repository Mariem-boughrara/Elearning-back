package com.example.elearning.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.elearning.entities.Etudiant;
import com.example.elearning.entities.Utilisateur;
import com.example.elearning.repositories.UtilisateurRepo;
import com.example.elearning.services.EtudiantService;


@Service
public class EtudiantServiceImpl implements EtudiantService{

	@Autowired
	private UtilisateurRepo userRepo;
	public Etudiant addEtudiant(Etudiant a) {
		return this.userRepo.save(a);		
	}
	public void  deleteEtudiant(int id) {
		this.userRepo.deleteById(id);
	}
	public Utilisateur getById(int id) {
		Optional<Utilisateur> user= this.userRepo.findById(id);
		return user.isPresent()?user.get():null;
	}
	public List<Utilisateur>getAllUtilisateurs(){
		return this.userRepo.findAll();
	}
	public Etudiant update(Etudiant a) {
		return this.userRepo.save(a);
	}
	@Override
	public Utilisateur getByInfo(String email, String password) {
		return this.userRepo.getByInfo(email,password);
		
	}
}
