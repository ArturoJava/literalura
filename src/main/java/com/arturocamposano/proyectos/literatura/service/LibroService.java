package com.arturocamposano.proyectos.literatura.service;
import com.arturocamposano.proyectos.literatura.model.Autor;
import com.arturocamposano.proyectos.literatura.model.Idioma;
import com.arturocamposano.proyectos.literatura.model.Libro;
import com.arturocamposano.literatura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LibroService {
    private LibroRepository libroRepository;
    @Autowired
    public LibroService(LibroRepository repository) {
        this.libroRepository = repository;
    }
    public LibroService(){};
    public List<Libro> obtenerTodosLosLibros() {
        return libroRepository.findAll();
    }
