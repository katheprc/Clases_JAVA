/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.katheprc.ejercicio1jpa;

import com.katheprc.ejercicio1jpa.entidades.Autor;
import com.katheprc.ejercicio1jpa.entidades.Editorial;
import com.katheprc.ejercicio1jpa.entidades.Libro;
import com.katheprc.ejercicio1jpa.persistencia.AutorDAO;
import com.katheprc.ejercicio1jpa.persistencia.EditorialDAO;
import com.katheprc.ejercicio1jpa.persistencia.LibroDAO;

/**
 *
 * @author KathePrc
 */
public class Ejercicio1JPA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
                
        AutorDAO autord = new AutorDAO();
        LibroDAO librod = new LibroDAO();
        EditorialDAO edid = new EditorialDAO();
        
        Editorial editorial = new Editorial("Maria", true);
        Autor autor = new Autor("Maria Lopez", true);
        Libro libro = new Libro(10, "titulo", 10, 10, 10, 10, true, autor, editorial);
        
        edid.guardardao(editorial);
        autord.guardardao(autor);
        librod.guardardao(libro);
        
    }
}
