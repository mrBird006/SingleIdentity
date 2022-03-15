package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Singer;
import com.example.demo.repository.SingerRepository;

@RestController
public class Controller {
	@Autowired
	
	private SingerRepository sRepo;
	
	@GetMapping("/singers")
	private List<Singer> getSingers(){
		return sRepo.findAll();
	}
	
	@GetMapping("/singers/{name}")
	private List<Singer> getSingersByName(@PathVariable String name){
		return sRepo.findByName(name);
	}
	
	@PostMapping("/singers")
	private Singer saveSinger(Singer singer){
		return sRepo.save(singer);
	}
	
	@GetMapping("/add_singer")
	private Singer addSinger(){
		Singer singer = new Singer();
		return sRepo.save(singer);
	}
	
}
