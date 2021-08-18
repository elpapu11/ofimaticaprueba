package com.example.spring.api.controller;

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

import com.example.spring.api.model.Libro;
import com.example.spring.api.service.LibroService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/libros"})
public class LibroController {
	@Autowired	
	LibroService service;
	
	@GetMapping
	public List<Libro> listar(){
		return service.listar();
	}
	@PostMapping
	public Libro agregar(@RequestBody Libro p) {
		return service.add(p);
	}
	@GetMapping(path = {"/{id}"})
	public Libro listarId(@PathVariable("id")int id) {
		return service.listarId(id);
	}
	@PutMapping(path = {"/{id}"})
	public Libro editar(@RequestBody Libro p, @PathVariable("id") int id) {
		p.setId(id);
		return service.edit(p);
	}
	@DeleteMapping(path = {"/{id}"})
	public Libro delete(@PathVariable("id") int id) {
		return service.delete(id);
	}
}
