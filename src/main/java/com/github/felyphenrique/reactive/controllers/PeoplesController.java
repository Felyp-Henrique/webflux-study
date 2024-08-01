package com.github.felyphenrique.reactive.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.felyphenrique.reactive.models.People;
import com.github.felyphenrique.reactive.services.PeoplesService;

import reactor.core.publisher.Flux;

@RestController()
@RequestMapping("/peoples")
public class PeoplesController {
    private final PeoplesService service;

    @Autowired()
    public PeoplesController(PeoplesService service) {
        this.service = service;
    }

    @GetMapping()
    public @ResponseBody() Flux<People> index() {
        return this.service.all();
    }
}
