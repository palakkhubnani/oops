package javacodes;
class Vehicle1 {
    void drive() {
        System.out.println("Driving vehicle");
    }
}

class Car1 extends Vehicle1 {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class Main13 {
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.drive();
    }
}

