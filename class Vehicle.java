class Vehicle {
    void drive() {
        System.out.println("Driving...");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}