package com.r6facts.api.services;

import com.r6facts.api.repositories.FactRepository;
import com.r6facts.api.entities.Fact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactService implements IFactService{

    @Autowired
    private FactRepository factRepository;

    @Override
    public List<Fact> findAll() {
        return (List<Fact>) factRepository.findAll();
    }
}
