package com.example.spring.api.repository;
import java.util.List;

import org.springframework.data.repository.Repository;
import com.example.spring.api.model.Libro;
public interface LibroRepository extends Repository<Libro, Integer>{
	List<Libro>findAll();
	Libro findById(int id);
	Libro save(Libro p);
	void delete(Libro p);
}
