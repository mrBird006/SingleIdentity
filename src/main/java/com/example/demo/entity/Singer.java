package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/*
 * Esta es la unica entidad del taller 1. En el siguiente taller.
 * En el siguiente taller se agregara la entidad Orquesta
 * la cual se relacionara con Cantante
 * **/
 @Entity
public class Singer {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	public  Long id;
	public String name;
	public String email;
}
