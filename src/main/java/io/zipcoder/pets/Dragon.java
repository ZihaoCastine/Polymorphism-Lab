package io.zipcoder.pets;

/**
 * Created by zihaocastine on 5/4/16.
 */
public class Dragon extends Pet{
    Dragon(String type,String name){
        super(type,name);
    }

    public void speak(){
        System.out.println("Speak from dragon, and name is: "+getName());
    }
}
