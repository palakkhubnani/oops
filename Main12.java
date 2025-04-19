package javacodes;

class Vehicle {
    void drive() {
        System.out.println("Driving vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class Main12 {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
