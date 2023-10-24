package com.katheprc.ejercicio1jpa.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Libro implements Serializable {
    
    @Id
    private long isbn;
   
    private String titulo;
    private Integer anio, ejemplares, ejemplaresP, ejemplaresR;
    private boolean alta;
   
    
    @ManyToOne
    private Autor autor;
    
    @ManyToOne
    private Editorial editorial;

    public Libro() {
    }

    public Libro(long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresP, Integer ejemplaresR, boolean alta, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.ejemplaresP = ejemplaresP;
        this.ejemplaresR = ejemplaresR;
        this.alta = alta;
        this.autor = autor;
        this.editorial = editorial;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresP() {
        return ejemplaresP;
    }

    public void setEjemplaresP(Integer ejemplaresP) {
        this.ejemplaresP = ejemplaresP;
    }

    public Integer getEjemplaresR() {
        return ejemplaresR;
    }

    public void setEjemplaresR(Integer ejemplaresR) {
        this.ejemplaresR = ejemplaresR;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    
    
}
