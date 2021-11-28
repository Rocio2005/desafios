package com.desafio.disney.controller;


import com.desafio.disney.domain.Personaje;
import com.desafio.disney.repository.PersonajeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/characters")
public class PersonajeController {
    private final PersonajeRepository personajeRepository;

    public PersonajeController(PersonajeRepository personajeRepository){
        this.personajeRepository=personajeRepository;
    }


    @PostMapping/*Crear personaje*/
    public ResponseEntity<?> createPersonaje(@Valid @RequestBody Personaje personaje){
        return new ResponseEntity<>(personajeRepository.save(personaje), HttpStatus.CREATED);/*codigo 201*/
    }

    @DeleteMapping(value = "/usuario/{id}")/*Eliminar Personaje*/
    public ResponseEntity<?> borrarUsuario(@PathVariable Long id){
        personajeRepository.deleteById(id);
        return new ResponseEntity<>(id,HttpStatus.OK);
    }

    @PutMapping("/{id}")/*Actualizar Personaje*/
    public ResponseEntity<?>  modificarPersonaje(@PathVariable Long id,@RequestBody Personaje personaje){
        Personaje personajeAmodificar=personajeRepository.findById(id).get();

        personajeAmodificar.setNombre(personaje.getNombre());
        personajeAmodificar.setEdad(personaje.getEdad());
        personajeAmodificar.setPeso(personaje.getPeso());
        personajeAmodificar.setHistoria(personaje.getHistoria());

        personajeRepository.save(personajeAmodificar);

        return new ResponseEntity<>("usuario modificado",HttpStatus.OK);

    }


    @GetMapping/*TRAER TODOS LOS PERSONAJES*/
    public ResponseEntity<?> traerTodos(){

        return new ResponseEntity<>(personajeRepository.findAll(), HttpStatus.OK);
    }

    /*BUSQUEDA DE PERSONAJES*/

    /*@GetMapping("/{Nombre}")/*CONSULTAR  personajes POR palabra en el path
    public  ResponseEntity<?> traerPorNombre(@PathVariable String Nombre){

        return new ResponseEntity<>(personajeRepository.findByNombreContaining(Nombre),HttpStatus.OK);
    }*/


    /*@GetMapping("/{fechaDeCreacion}")/*OBTENER USUARIOS CREADOS LUEGO DE UNA FECHA
    public ResponseEntity<?> afterFechaDeCreacion(@PathVariable CharSequence fechaDeCreacion){

        LocalDateTime fechaIngresada=LocalDateTime.parse(fechaDeCreacion);

        List<Usuario> usuarios=usuarioRepository.findAll();
        List<Usuario> usuarioAfter=new ArrayList<>();
        for (Usuario usuario:usuarios){

            LocalDateTime fecha=usuario.getFechaDeCreacion();
            if (fecha.isAfter(fechaIngresada)){
                usuarioAfter.add(usuario);
            }
        }

        return new ResponseEntity<>(usuarioAfter,HttpStatus.OK);


    }*/





}
