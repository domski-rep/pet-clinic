package com.petclinicmilo.petclinic.services;

import com.petclinicmilo.petclinic.model.Owner;
import com.petclinicmilo.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save ( Owner owner);

    Set<Pet> findAll();

}
