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

import com.example.elearning.entities.Exercices;
import com.example.elearning.services.ExercicesService;


@CrossOrigin("*")
@RestController
@RequestMapping("api/exercices")
public class ExercicesController {
	@Autowired
	ExercicesService exerService;
	
	@GetMapping("/all")
	public List<Exercices>getAllExercices(){
		return this.exerService.getAllExercices();
	}
	@PostMapping("/add")
	public Exercices addExercices(@RequestBody Exercices a) {
		return this.exerService.addExercice(a);
	}
	@GetMapping("/{id}")
	public Exercices getById(@PathVariable int id) {
		return this.exerService.getById(id);
	}
	@PutMapping("/update/{id}")
	public Exercices update(@PathVariable int id,@RequestBody Exercices a) {
		return this.exerService.update(a);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		this.exerService.deleteExercice(id);
		
	}
	
}
