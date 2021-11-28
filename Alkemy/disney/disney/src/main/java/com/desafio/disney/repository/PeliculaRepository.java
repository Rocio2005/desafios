package com.desafio.disney.repository;

import com.desafio.disney.domain.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {

    //List<Usuario> findByCiudadContaining(String ciudad);

    //Usuario getByFechaDeCreacion(LocalDateTime fecha);

}
