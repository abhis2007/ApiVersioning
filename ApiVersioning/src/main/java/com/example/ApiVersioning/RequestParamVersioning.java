package com.example.ApiVersioning;


import com.example.ApiVersioning.Utility.Name;
import com.example.ApiVersioning.Utility.Person1;
import com.example.ApiVersioning.Utility.Person2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RequestParamVersioning {
    @GetMapping(value="/person/param", params = "version=1")
    public List<Person1> getAllPersonV1() {
        List<Person1> person = new ArrayList<>() ;
        person.add(new Person1("Abhishek Kumar")) ;
        person.add(new Person1("Suruchi Kumar")) ;
        person.add(new Person1("Suman Kumari")) ;
        person.add(new Person1("Rahul Kumar")) ;

        return person ;
    }

    @GetMapping(value = "/person/param", params = "version=2")
    public List<Person2> getAllPerson() {
        List<Person2> person = new ArrayList<>() ;
        person.add(new Person2(new Name("Abhishek", "Kumar"))) ;
        person.add(new Person2(new Name("Suman", "Kumari"))) ;
        person.add(new Person2(new Name("Suruchi", "Kumari"))) ;
        person.add(new Person2(new Name("Rahul", "Kumar"))) ;
        return person ;
    }
}
