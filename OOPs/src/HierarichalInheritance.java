class Vehicle {
    void start() {
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle {
    void openTrunk() {
        System.out.println("Car trunk opened");
    }
}

class Truck extends Vehicle {
    void loadCargo() {
        System.out.println("Truck is Ready to move with cargo");
    }
}

public class HierarichalInheritance {
    public static void main(String[] args) {

        Car car = new Car();
        car.start();       // inherited method
        car.openTrunk();   // Car's own method

        Truck truck = new Truck();
        truck.start();     // inherited method
        truck.loadCargo(); // Truck's own method
    }
}
