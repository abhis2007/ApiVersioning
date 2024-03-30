package com.example.ApiVersioning;

import com.example.ApiVersioning.Utility.Name;
import com.example.ApiVersioning.Utility.Person1;
import com.example.ApiVersioning.Utility.Person2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AcceptHeaderVersioning {

    //Note
    // produces = "applications/vndapp+json" - application/{name}+{format} - this is needed
    @GetMapping(value = "/person/produces", produces = "application/myappv1+json")
    public List<Person1> getAllPersonV1(){
        List<Person1> person = new ArrayList<>() ;

        person.add(new Person1("Abhishek Kumar")) ;
        person.add(new Person1("Suman Kumari")) ;
        person.add(new Person1("Suruchi Kumari")) ;
        person.add(new Person1("Rahul Kumar")) ;
        return person ;
    }

    @GetMapping(value = "/person/produces", produces = "application/myappv2+json")
    public List<Person2> getALlPersonV2() {

        List<Person2 > person2s = new ArrayList<>() ;

        person2s.add(new Person2(new Name("Abhishek", "Kumar"))) ;
        person2s.add(new Person2(new Name("Sumar", "Kumar"))) ;
        person2s.add(new Person2(new Name("Suruchi", "Kumar"))) ;
        person2s.add(new Person2(new Name("Rahul", "Kumar"))) ;
        return person2s ;
    }
}
