package io.zipcoder.pets;

import java.util.HashMap;

import java.util.Scanner;

/**
 * Created by zihaocastine on 5/4/16.
 */
public class PetDriver {
    public static void main(String[] args) {
        PetDriver petDriver=new PetDriver();
        petDriver.user();

    }

    public void user() {
        Scanner input = new Scanner(System.in);
        int num;
        String name;
        String type;
        Pet petArray[];

        System.out.print("How many pets do you have?: ");
        num = input.nextInt();
        petArray = new Pet[num];
        //Enter pets;
        for (int i = 0; i < num; i++) {
            System.out.print((i + 1) + " type: ");
            type = input.next().toLowerCase();
            System.out.print((i + 1) + " name: ");
            name = input.next().toLowerCase();
            switch (type) {
                case "cat":
                    petArray[i] = new Cat(type,name);
                    //petArray[i].speak();
                    break;
                case "dog":
                    petArray[i] = new Dog(type,name);
                    //petArray[i].speak();
                    break;
                case "dragon":
                    petArray[i] = new Dragon(type,name);
                    //petArray[i].speak();
                    break;
                default:
                    System.out.println("Can't find a match of the type of animal");
                    i--;
                    break;

            }

        }
        //print speak
        for (int i = 0; i < num; i++) {
            petArray[i].speak();
        }

    }
}
