package com.example.elearning.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
@DiscriminatorValue("Enseignant")
public class Enseignant extends Utilisateur implements Serializable {
	@OneToMany(cascade = CascadeType.ALL,mappedBy ="enseignant")
	private List<Cours> cours = new ArrayList<Cours>();
	@OneToMany(cascade = CascadeType.ALL,mappedBy ="ens")
	private List<Exercices> exos = new ArrayList<Exercices>();

	private static final long serialVersionUID = 1L;

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}
			

	public List<Cours> getCours() {
		return cours;
	}

	public void setCours(List<Cours> cours) {
		this.cours = cours;
	}
	public List<Exercices> getExos() {
		return exos;
	}
	public void setExos(List<Exercices> exos) {
		this.exos = exos;
	}
	
	

}

