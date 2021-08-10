package com.example.spring.api.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.spring.api.model.Persona;

public interface PersonaRepository extends Repository<Persona, Integer>{
	List<Persona>findAll();
	Persona findById(int id);
	Persona save(Persona p);
	void delete(Persona p);
}
