package org.example;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;

    // we only use "this" when we have conflicted parameters and fields.

    public Car(String make, double price, int year, String color) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
    }
    //copy constructor
    public Car(Car source){
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
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
}
