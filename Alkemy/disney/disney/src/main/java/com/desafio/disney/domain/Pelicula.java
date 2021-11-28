package com.desafio.disney.domain;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Pelicula {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long Id;

    @NotBlank
    private String Titulo;

    @CreationTimestamp /*¿?*/
    private LocalDateTime fechaDeCreacion;

    @NotNull
    private Short Calificacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private Genero genero;


    /*@ManyToMany(mappedBy = "personajes")
    private List<Personaje> personajes;*/

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public LocalDateTime getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(LocalDateTime fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Short getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(Short calificacion) {
        Calificacion = calificacion;
    }

    /*public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }*/

    /*public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }*/
}
