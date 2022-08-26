package com.example.pets;

//@Service
//@Profile({ "cat", "default" })
public class CatPetService implements PetService {

	@Override
	public String getPetType() {
		return "Cats are the best!";
	}

}
