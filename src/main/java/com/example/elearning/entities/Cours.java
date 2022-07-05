package com.example.elearning.entities;
import java.io.Serializable;
import java.util.Date;
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
@Table(name="T_cours")
public class Cours implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cours_id")
	private int id;
	
	public Enseignant getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}
	
	@Column(name="cours_titre")
	private String titre;
	
	@ManyToOne
	private Enseignant enseignant;
	
	
	
	public Cours(int id, String titre) {
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
		return "Cours [id=" + id + ", titre=" + titre +  "]";
	}
		public Cours() {
			super();
		}
	
	
	

}

