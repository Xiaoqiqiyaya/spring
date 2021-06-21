package com.kuanng.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.concurrent.atomic.DoubleAccumulator;

public class People {
    @Autowired
    private  Cat cat;

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }

    @Autowired
    @Qualifier(value = "dog22")
    private Dog dog;


    private  String  name;




}
