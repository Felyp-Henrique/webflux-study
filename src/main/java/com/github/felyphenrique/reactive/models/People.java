package com.github.felyphenrique.reactive.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "peoples")
public class People {

    @Id()
    private int id;

    @Column(value = "first_name")
    private String firstName;

    @Column(value = "last_name")
    private String lastName;

    public People() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
