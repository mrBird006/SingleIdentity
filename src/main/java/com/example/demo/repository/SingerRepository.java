package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Singer;


/*Este repositorio es una interface que tiene definidas las funcionaes basicas (CRUD)
 * y otras mas. Luego Spring JPA se encarga de proveer la implementacion de la misma
 * */
@Repository
public interface SingerRepository extends JpaRepository<Singer, Long> {
	
	 public List<Singer> findByName(String name);
	 
}
