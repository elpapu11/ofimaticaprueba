package com.example.spring.api.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.api.model.Persona;
import com.example.spring.api.repository.PersonaRepository;
import com.example.spring.api.service.PersonaService;

@Service
public class PersonaServiceImp implements PersonaService{
	@Autowired
	private PersonaRepository repository;
	
	
	@Override
	public List<Persona> listar() {
		return repository.findAll();
	}

	@Override
	public Persona listarId(int id) {
		return repository.findById(id);
	}

	@Override
	public Persona add(Persona p) {
		return repository.save(p);
	}

	@Override
	public Persona edit(Persona p) {
		return repository.save(p);
	}

	@Override
	public Persona delete(int id) {
		Persona p = repository.findById(id);
		if (p != null) {
			repository.delete(p);
		}
		return p;
	}
	
}
