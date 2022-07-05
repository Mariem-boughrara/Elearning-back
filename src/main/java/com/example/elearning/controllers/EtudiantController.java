package com.example.elearning.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.elearning.entities.Etudiant;
import com.example.elearning.entities.Utilisateur;
import com.example.elearning.services.EtudiantService;


@CrossOrigin("*")
@RestController
@RequestMapping("api/etudiants")
public class EtudiantController {
	@Autowired
	EtudiantService userService;
	
	@GetMapping("/all")
	public List<Utilisateur>getAllUsers(){
		return this.userService.getAllUtilisateurs();
	}
	@PostMapping("add")
	public Etudiant addUser(@RequestBody Etudiant a) {
		return this.userService.addEtudiant(a);
	}
	@GetMapping("/{id}")
	public Utilisateur getById(@PathVariable int id) {
		return this.userService.getById(id);
	}
	@PutMapping("/update/{id}")
	public Etudiant update(@PathVariable int id,@RequestBody Etudiant a) {
		return this.userService.update(a);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		this.userService.deleteEtudiant(id);
		
	}
	@GetMapping("info/{email}/{password}")
	public Utilisateur getByInfo(@PathVariable String email,@PathVariable String password) {
		return this.userService.getByInfo(email,password);
	}

}

