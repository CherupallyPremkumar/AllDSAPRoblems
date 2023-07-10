package com.premkumar.DSA.jackson;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Author extends Person
{
    List<Person> l=new ArrayList<>();

    public Author(String first_name, String last_name) {
        super(first_name, last_name);
    }
    @JsonProperty()
    public List<Person> getPerson()
    {
        return l;
    }
    @JsonProperty
    public void setItem(Person author)
    {
        l.add(author);
    }

}
