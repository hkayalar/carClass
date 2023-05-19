package org.example;

public class Dealership {
    private Car[] cars;

    //constructor
    public Dealership(Car[] cars) {
        this.cars= new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
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

    public int search(String make, int budget) {
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null){
                continue;
            }
            else if(this.cars[i].getMake().equalsIgnoreCase(make) && this.cars[i].getPrice() <= budget){
                System.out.println("Great, We have the car for you in spot "+ i + "\n" + cars[i].toString() + "\nAre you interested?");
                System.out.println("If you are interested, type 'yes'");
                return i;
            }
         }
         System.out.println("\n We are unable to provide you a car.");
        return 404;
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
