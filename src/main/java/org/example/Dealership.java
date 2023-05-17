package org.example;

public class Dealership {
    private Car[] cars;

    //constructor
    public Dealership() {
        this.cars= new Car[3];
    }

    //setters
    public void setCar(Car car, int index) {
        this.cars[index] = new Car(car);
    }
    //getters
    public Car getCar(int index){
        return new Car(this.cars[index]);
        
    }
}
