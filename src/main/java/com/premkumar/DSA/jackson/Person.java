package com.premkumar.DSA.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @JsonProperty
    String first_name;
    @JsonProperty
    String last_name;

    public Person(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }
}
