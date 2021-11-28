package com.desafio.disney.repository;

import com.desafio.disney.domain.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {

    //List<Usuario> findByCiudadContaining(String ciudad);

    //Usuario getByFechaDeCreacion(LocalDateTime fecha);

}
