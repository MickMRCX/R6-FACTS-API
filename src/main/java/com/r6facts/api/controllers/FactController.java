package com.r6facts.api.controllers;

import com.r6facts.api.entities.Fact;
import com.r6facts.api.services.FactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(path = "/facts", produces = MediaType.APPLICATION_JSON_VALUE)
public class FactController {

    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private  FactService factService;

    @GetMapping("/getAll")
    public List<Fact> fact() {
        return factService.findAll();
    }

    //@RequestMapping(value = "/products", method = RequestMethod.POST)
    //@RequestMapping(value = "/products", method = RequestMethod.DELETE)
    //@RequestMapping(value = "/products", method = RequestMethod.PUT)
}
