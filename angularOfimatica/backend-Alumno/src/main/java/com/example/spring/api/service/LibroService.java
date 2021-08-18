package com.example.spring.api.service;

import java.util.List;

import com.example.spring.api.model.Libro;

public interface LibroService {
	List<Libro> listar();
	Libro listarId(int id);
	Libro add(Libro p);
	Libro edit(Libro p);
	Libro delete(int id);
}
