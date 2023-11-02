package com.katheprc.Prueba1.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class prueba {

	@Id
	private Integer id;
	
	private String nombre;
	
}
