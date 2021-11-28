package com.desafio.disney.repository;

import com.desafio.disney.domain.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {

        /*List<Personaje> findByNombreContaining(String Nombre);*/

    //Usuario getByFechaDeCreacion(LocalDateTime fecha);

}
