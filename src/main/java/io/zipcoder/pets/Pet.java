package io.zipcoder.pets;


import java.util.HashMap;

/**
 * Created by zihaocastine on 5/4/16.
 */
abstract class Pet implements PetInterface{


    private String type;
    private String name;

    public Pet(String type, String name){
        this.type=type;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void speak();

}
