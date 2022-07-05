package com.example.elearning.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="T_exercices")

public class Exercices implements Serializable {
	
	@ManyToOne
	private Enseignant ens;
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ex_id")
	private int id;
	@Column(name="ex_titre")
	private String titre;
	public Exercices() {
		super();
	}
	public Exercices(int id, String titre) {
		super();
		this.id = id;
		this.titre = titre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	@Override
	public String toString() {
		return "Exercices [id=" + id + ", titre=" + titre + "]";
	}
	

}

