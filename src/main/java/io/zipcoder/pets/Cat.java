package io.zipcoder.pets;

/**
 * Created by zihaocastine on 5/4/16.
 */
public class Cat extends Pet {

    Cat(String type,String name){
        super(type,name);
    }

    public void speak(){
        System.out.println("Speak from cat, and name is: "+this.getName());
    }

}
