package com.example.springframework.sfgSpringDI.controllers;

import org.springframework.stereotype.Controller;

import com.example.pets.PetService;

@Controller
public class PetController {

	private final PetService petService;

	public PetController(PetService petService) {
		super();
		this.petService = petService;
	}

	public String whichPetIsTheBest() {
		return petService.getPetType();
	}
}
