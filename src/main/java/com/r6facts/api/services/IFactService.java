package com.r6facts.api.services;

import com.r6facts.api.entities.Fact;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IFactService {

    List<Fact> findAll();
}
