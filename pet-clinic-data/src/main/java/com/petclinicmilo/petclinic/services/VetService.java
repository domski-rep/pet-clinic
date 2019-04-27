package com.petclinicmilo.petclinic.services;

import com.petclinicmilo.petclinic.model.Owner;
import com.petclinicmilo.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet  findById(Long id);

    Vet save ( Owner owner);

    Set<Vet> findAll();
}
