/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katheprc.ejercicio1jpa.persistencia;

import com.katheprc.ejercicio1jpa.entidades.Editorial;

/**
 *
 * @author KathePrc
 */
public final class EditorialDAO extends DAO<Editorial> {

	public void guardardao(Editorial editorial) {
		guardar(editorial);
	}
	
	
}
