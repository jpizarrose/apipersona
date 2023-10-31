package com.mycompany.apipersona.Servivios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.apipersona.Entidad.Persona;
import com.mycompany.apipersona.Repositorios.PersonaRepositorio;

@Service
public class PersonaServicios {

    @Autowired
    private PersonaRepositorio pRepositorio;

    // Crear metodos
    // Listar todos los usuarios (personas)

    public List<Persona> verTodos() {
        return pRepositorio.findAll();
    }

    public Persona verPorId(Integer id){
        return pRepositorio.findById(id).orElse(null);
    }

    public Persona crearPersona(Persona persona){
        return pRepositorio.save(persona);
    }

    public void borrrarPerosna(Integer id){
        pRepositorio.deleteById(id);
    }
}
