package com.example.spring.api.service;

import java.util.List;

import com.example.spring.api.model.Persona;

public interface PersonaService {
	List<Persona> listar();
	Persona listarId(int id);
	Persona add(Persona p);
	Persona edit(Persona p);
	Persona delete(int id);
}
