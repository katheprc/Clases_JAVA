/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katheprc.ejercicio1jpa.persistencia;

import com.katheprc.ejercicio1jpa.entidades.Autor;

/**
 *
 * @author KathePrc
 */
public final class AutorDAO extends DAO<Autor> {

	public void guardardao(Autor autor) {
		guardar(autor);
	}
	
	
}

