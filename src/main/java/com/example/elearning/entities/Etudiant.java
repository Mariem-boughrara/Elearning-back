package com.example.elearning.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
@Entity
@DiscriminatorValue("Etudiant")
public class Etudiant extends Utilisateur implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}