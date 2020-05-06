package com.r6facts.api.repositories;

import com.r6facts.api.entities.Fact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactRepository extends CrudRepository<Fact, Long> {

    @Override
    Iterable<Fact> findAll();

}

