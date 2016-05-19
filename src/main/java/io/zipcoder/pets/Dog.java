package io.zipcoder.pets;

/**
 * Created by zihaocastine on 5/4/16.
 */
public class Dog extends Pet {

    Dog(String type,String name){
        super(type,name);
    }
    public void speak(){
        System.out.println("speak from Dog, name is: "+getName() );

    }

}
