package com.mycompany.apipersona.Controlador;

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

import com.mycompany.apipersona.Entidad.Persona;
import com.mycompany.apipersona.Servivios.PersonaServicios;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class PersonaController {

    @Autowired
    private PersonaServicios pServicios;

    // metodos HTTP ( GET , POST , PUT , DELETE)

    // conecta back-end con Front-end (internet)

    // GET todos
    @GetMapping("/all")
    public List<Persona> obtenerTodos(){
        return pServicios.verTodos();
    }

    // Get uno por su ID
    //@PathVariable es cuando la variable cambia , en este  caso el id irá cambiando
    @GetMapping("/all/{id}")
    public Persona obtenerId(@PathVariable Integer id){
        return pServicios.verPorId(id);
    }

    // POST (crear, enviar, grabar informacion)
    @PostMapping("/crear")
    public Persona crearPersona(@RequestBody Persona persona){
        return pServicios.crearPersona(persona);
    }

    // PUT modificar por id
    // reciclar metodo crear ( grabar encima)
    @PutMapping("/actualizar/{id}")
    public Persona actualizarPersona(@RequestBody Persona PersonaActualizada , @PathVariable Integer id){
        return pServicios.crearPersona(PersonaActualizada);
    }


    //DELETE persona
    @DeleteMapping("borrar/{id}")
    public void borrarPersona(@PathVariable Integer id){
         pServicios.borrrarPerosna(id);
    }
}
