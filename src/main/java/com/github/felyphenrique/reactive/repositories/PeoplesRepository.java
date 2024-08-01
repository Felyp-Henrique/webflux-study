package com.github.felyphenrique.reactive.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.github.felyphenrique.reactive.models.People;

@Repository()
public interface PeoplesRepository extends ReactiveCrudRepository<People, Integer> {

}
