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

    public void sell(int index) {
        this.cars[index].drive();
        this.cars[index] = null;
    }

    String search(String make, int budget) {
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null){
                continue;
            }
            else if(this.cars[i].getMake().equals(make) && this.cars[i].getPrice() <= budget){
                return "Great, We have the car for you in spot "+ i + "\n" + this.cars[i].toString() + "\nAre you interested?";
            }
        }
        return "Sorry, we could not find any cars for you.";
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            if (this.cars[i] == null){
                temp += "Empty Spot\n";
            }
            else temp += this.cars[i].toString() + "\n";

        }
        return  temp;
    }
}
