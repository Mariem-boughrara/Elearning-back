package com.example.elearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.elearning.entities.Cours;

public interface CoursRepo extends JpaRepository<Cours, Integer>{

	
}