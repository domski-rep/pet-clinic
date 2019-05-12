package com.petclinicmilo.petclinic.services;

import com.petclinicmilo.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName (String lastName);
}
