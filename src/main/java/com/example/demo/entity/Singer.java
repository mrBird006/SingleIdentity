package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/*
 * Esta es la unica entidad del taller 1. En el siguiente taller.
 * En el siguiente taller se agregara la entidad Orquesta
 * la cual se relacionara con Cantante
 * **/
 @Entity
 @NoArgsConstructor
 @AllArgsConstructor
 @Data
public class Singer {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;
	private String name;
	private String email;
        private String musicalGenre;
}
