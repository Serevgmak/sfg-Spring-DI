package com.example.pets;

//@Service
//@Profile("dog")
public class DogPetService implements PetService {

	@Override
	public String getPetType() {
		return "Dogs are the best!";
	}

}
