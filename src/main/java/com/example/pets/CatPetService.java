package com.example.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({ "cat", "default" })
public class CatPetService implements PetService {

	@Override
	public String getPetType() {
		return "Cats are the best!";
	}

}
