package com.example.springmongo.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmongo.model.Animal;
import com.example.springmongo.repository.AnimalRepository;

@RestController
@RequestMapping("/animal")
public class AnimalController {

	@Autowired
	private AnimalRepository animalRepository;
	
	@GetMapping("/get/{id}")
	public Animal getAnimalById(@PathVariable("id") ObjectId id) {
		return animalRepository.findBy_id(id);
	}
}
