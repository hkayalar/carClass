package org.example;

public class Main {
    public static void main(String[] args) {

        /* when we are creating an object named nissan2
        if we use Car nissanTwo = nissan method, we will fell to the trap because when we use setColor to
        nissanTwo and change its color, first nissan objects' color will change too because it is
        not copying the source it is copying the reference. Instead of this we can create the second
        object from beginning. OR we can use copy constructors. */

        Car nissan = new Car("Nissan", 5000, 2020, "red");
        Car dodge = new Car("Dodge", 11000, 2018, "blue");
        Car nissan2 = new Car(nissan); //calling the copy constructor

        nissan.setColor("Jet Black");
        dodge.setColor("Jet Black");

        double newPrice = nissan.getPrice() / 2;
        nissan.setPrice(newPrice);

        double newPriceTwo = dodge.getPrice()*3/2;
        dodge.setPrice(newPriceTwo);

        nissan.drive();

    }
}