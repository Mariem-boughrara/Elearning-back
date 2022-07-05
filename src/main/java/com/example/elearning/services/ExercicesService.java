package com.example.elearning.services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.elearning.entities.Exercices;
public interface ExercicesService {

	public Exercices addExercice(Exercices a);
	public void  deleteExercice(int id);
	public Exercices getById(int id);
	public List<Exercices>getAllExercices();
	public Exercices update(Exercices a);
}
