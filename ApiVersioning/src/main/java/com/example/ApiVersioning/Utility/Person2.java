package com.example.ApiVersioning.Utility;

import com.example.ApiVersioning.Utility.Name;

public class Person2 {
    private Name name ;

    public Person2(){
        super() ;
    }

    public Person2(Name name ){
        this.name = name ;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}

