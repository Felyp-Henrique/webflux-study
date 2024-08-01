package com.github.felyphenrique.reactive.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.felyphenrique.reactive.models.People;
import com.github.felyphenrique.reactive.repositories.PeoplesRepository;

import reactor.core.publisher.Flux;

@Service()
public class PeoplesService {
    private final PeoplesRepository repository;

    @Autowired()
    public PeoplesService(PeoplesRepository repository) {
        this.repository = repository;
    }

    public Flux<People> all() {
        return this.repository.findAll();
    }
}
