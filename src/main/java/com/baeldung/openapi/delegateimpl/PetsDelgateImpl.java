package com.baeldung.openapi.delegateimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import com.baeldung.openapi.api.PetsApiDelegate;
import com.baeldung.openapi.model.Pet;

@Service
public class PetsDelgateImpl implements PetsApiDelegate{

	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return PetsApiDelegate.super.getRequest();
	}

	@Override
	public ResponseEntity<Void> createPets() {
		// TODO Auto-generated method stub
		return PetsApiDelegate.super.createPets();
	}

	@Override
	public ResponseEntity<List<Pet>> listPets(Integer limit) {
		// TODO Auto-generated method stub
		return PetsApiDelegate.super.listPets(limit);
	}

	@Override
	public ResponseEntity<Pet> showPetById(String petId) {
		// TODO Auto-generated method stub
		Pet pet = new Pet();
		pet.setName("Puppy");
		pet.setTag("Tag");
		return ResponseEntity.ok(pet);
//		return PetsApiDelegate.super.showPetById(petId);
	}

}
