package com.petclinicmilo.petclinic.services.map;

import com.petclinicmilo.petclinic.model.Owner;
import com.petclinicmilo.petclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap
        extends AbsractMapService<Owner, Long>
        implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return this.findById(id);
    }

    @Override
    public void deleteById(Long id) {
         this.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }
}
