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

import com.example.elearning.entities.Cours;
import com.example.elearning.services.CoursService;



@CrossOrigin("*")
@RestController
@RequestMapping("api/cours")
public class CoursController {
	@Autowired
	CoursService coursService;
	
	@GetMapping("/all")
	public List<Cours>getAllCours(){
		return this.coursService.getAllcours();
	}
	@PostMapping("/add")
	public Cours addCours(@RequestBody Cours a) {
		return this.coursService.addCours(a);
	}
	@GetMapping("/{id}")
	public Cours getById(@PathVariable int id) {
		return this.coursService.getById(id);
	}
	@PutMapping("/update/{id}")
	public Cours update(@PathVariable int id,@RequestBody Cours a) {
		return this.coursService.update(a);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		this.coursService.deleteCours(id);
		
	}
	
}

