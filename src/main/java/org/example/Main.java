package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /* when we are creating an object named nissan2
        if we use Car nissanTwo = nissan method, we will fell to the trap because when we use setColor to
        nissanTwo and change its color, first nissan objects' color will change too because it is
        not copying the source it is copying the reference. Instead of this we can create the second
        object from beginning. OR we can use copy constructors. */

        Car[] cars = new Car[]{
                new Car("Nissan", 5000, 2020, "red", new String[]{"tires", "keys"}),
                new Car("Dodge", 11000, 2018, "blue", new String[]{"tires", "keys"}),
                new Car("Nissan", 5000, 2020, "yellow", new String[]{"tires", "filter"}),
        };


        Dealership dealership = new Dealership();

        for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i], i);
        }

        System.out.println(dealership.getCar(0));
    }
}