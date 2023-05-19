package org.example;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        /* when we are creating an object named nissan2
        if we use Car nissanTwo = nissan method, we will fell to the trap because when we use setColor to
        nissanTwo and change its color, first nissan objects' color will change too because it is
        not copying the source it is copying the reference. Instead of this we can create the second
        object from beginning. OR we can use copy constructors. */

        Car[] cars = new Car[]{
                new Car("Nissan", 5000, 2020, "red", new String[]{"tires", "keys"}),
                new Car("Dodge", 8500, 2019, "blue", new String[]{"tires", "keys"}),
                new Car("Nissan", 5000, 2017, "yellow", new String[]{"tires", "filter"}),
                new Car("Honda", 7000, 2019, "orange", new String[]{"tires", "filter"}),
                new Car("Mercedes", 12000, 2015, "jet black", new String[]{"tires", "filter", "transmission"}),
        };


        Dealership dealership = new Dealership(cars);
    
        System.out.println("\n Welcome to our dealership!\n Enter the type of car you are looking for: ");
        String make = scan.nextLine();
        System.out.println("Enter your budget: ");
        int budget = scan.nextInt();

        
        int index = dealership.search(make, budget);
        
        switch(index){
            case 404: System.out.println("Feel free to browse through our collection of cars. ");
            System.out.println(dealership);
            break;
            
            default: scan.nextLine();
            String decision = scan.nextLine();
            if (decision.equalsIgnoreCase("yes")) { dealership.sell(index);}
            }

        }
    }
    
