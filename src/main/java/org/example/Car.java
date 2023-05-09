package org.example;
import java.util.Arrays;
public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    // we only use "this" when we have conflicted parameters and fields.

    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
        // if we use this.parts = parts, every parts parameter will change in nissan exc. will change.
        //to avoid that we will use copy of parts array.
    }


    //copy constructor
    public Car(Car source){
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    //getters - each field has one getter
    public String getMake(){
        return this.make;
    }

    public double getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    public String getColor() {
        return this.color;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }
    //setters - each field has one setter.
    public void setMake(String make){
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParts(String[] parts){
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    //new drive function
    public void drive() {
        System.out.println("You bought the beautiful " + this.year + " " + this.color + " " + this.make + " for " + this.price+ "." );
    }

    public String toString() {
        return    "Make: " + this.make + ".\n"
                + "Price: " + this.price + ".\n"
                + "Year: " + this.year + ".\n"
                + "Color: " + this.color + ".\n"
                + "Parts: " + Arrays.toString(parts) + ".\n";
    }


}
