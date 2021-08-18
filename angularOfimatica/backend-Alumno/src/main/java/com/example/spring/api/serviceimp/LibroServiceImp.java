package com.example.spring.api.serviceimp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.api.model.Libro;
import com.example.spring.api.repository.LibroRepository;
import com.example.spring.api.service.LibroService;

@Service
public class LibroServiceImp implements LibroService{
	@Autowired
	private LibroRepository repository;
	
	@Override
	public List<Libro> listar() {
		return repository.findAll();
	}

	@Override
	public Libro listarId(int id) {
		return repository.findById(id);
	}

	@Override
	public Libro add(Libro p) {
		return repository.save(p);
	}

	@Override
	public Libro edit(Libro p) {
		return repository.save(p);
	}

	@Override
	public Libro delete(int id) {
		Libro p = repository.findById(id);
		if (p != null) {
			repository.delete(p);
		}
		return p;
	}
	
}
