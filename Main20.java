package javacodes;
//Base class
//Base class
class Vehicle33 {
 String make, model, fuelType;
 int year;

 Vehicle33(String make, String model, int year, String fuelType) {
     this.make = make;
     this.model = model;
     this.year = year;
     this.fuelType = fuelType;
 }

 double calculateFuelEfficiency() {
     return 0.0;
 }

 double distanceTraveled(double time, double speed) {
     return time * speed;
 }

 double getMaxSpeed() {
     return 0.0;
 }
}

//Subclass: Truck
class Truck extends Vehicle33 {
 Truck(String make, String model, int year, String fuelType) {
     super(make, model, year, fuelType);
 }

 @Override
 double calculateFuelEfficiency() {
     return 8.0; // km/l
 }

 @Override
 double getMaxSpeed() {
     return 120.0;
 }
}

//Subclass: Car
class Car11 extends Vehicle33 {
 Car11(String make, String model, int year, String fuelType) {
     super(make, model, year, fuelType);
 }

 @Override
 double calculateFuelEfficiency() {
     return 15.0;
 }

 @Override
 double getMaxSpeed() {
     return 180.0;
 }
}

//Subclass: Motorcycle
class Motorcycle extends Vehicle33 {
 Motorcycle(String make, String model, int year, String fuelType) {
     super(make, model, year, fuelType);
 }

 @Override
 double calculateFuelEfficiency() {
     return 35.0;
 }

 @Override
 double getMaxSpeed() {
     return 160.0;
 }
}

//Test Program
public class Main20 {
 public static void main(String[] args) {
     Vehicle33 car = new Car11("Toyota", "Corolla", 2022, "Petrol");
     Vehicle33 truck = new Truck("Volvo", "FH", 2020, "Diesel");
     Vehicle33 motorcycle = new Motorcycle("Yamaha", "R15", 2023, "Petrol");

     System.out.println("Car fuel efficiency: " + car.calculateFuelEfficiency());
     System.out.println("Truck max speed: " + truck.getMaxSpeed());
     System.out.println("Motorcycle distance traveled in 2 hrs at 80 km/h: " + motorcycle.distanceTraveled(2, 80) + " km");
 }
}
