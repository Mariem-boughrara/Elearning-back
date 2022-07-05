package com.example.elearning.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.elearning.entities.Exercices;
import com.example.elearning.repositories.ExercicesRepo;
import com.example.elearning.services.ExercicesService;


@Service
public class ExercicesServiceImpl implements ExercicesService {
	@Autowired
	private ExercicesRepo exerRepo;
	public Exercices addExercice(Exercices a) {
		return this.exerRepo.save(a);		
	}
	public void  deleteExercice(int id) {
		this.exerRepo.deleteById(id);
	}
	public Exercices getById(int id) {
		Optional<Exercices>u= this.exerRepo.findById(id);
		return u.isPresent()?u.get():null;
	}
	public List<Exercices>getAllExercices(){
		return this.exerRepo.findAll();
	}
	public Exercices update(Exercices a) {
		return this.exerRepo.save(a);
	}

}
