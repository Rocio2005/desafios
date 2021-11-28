package com.desafio.disney.domain;

import com.sun.istack.NotNull;

import javax.imageio.ImageIO;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.awt.*;
import java.util.List;


@Entity
public class Personaje {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long Id;

    @NotBlank
    private String Nombre;

    @NotNull
    private Integer Edad;
    private Float Peso;
    private String Historia;

    /*@ManyToMany(cascade = CascadeType.PERSIST)
    private List<Pelicula> peliculas;*/


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public Float getPeso() {
        return Peso;
    }

    public void setPeso(Float peso) {
        Peso = peso;
    }

    public String getHistoria() {
        return Historia;
    }

    public void setHistoria(String historia) {
        Historia = historia;
    }

    /*public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }*/
}
