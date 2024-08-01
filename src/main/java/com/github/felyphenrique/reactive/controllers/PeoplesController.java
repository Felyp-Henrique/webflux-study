package com.github.felyphenrique.reactive.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.felyphenrique.reactive.models.People;

import reactor.core.publisher.Flux;

@RestController()
@RequestMapping("/peoples")
public class PeoplesController {

    @GetMapping()
    public @ResponseBody() Flux<People> index() {
        return Flux.empty();
    }
}
