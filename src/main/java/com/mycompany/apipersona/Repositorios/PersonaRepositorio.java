package com.mycompany.apipersona.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.apipersona.Entidad.Persona;


public interface PersonaRepositorio extends JpaRepository<Persona , Integer>{
    
}
