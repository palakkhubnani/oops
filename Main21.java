package javacodes;
//Base class
class Employee44 {
 String name, address, jobTitle;
 double salary;

 Employee44(String name, String address, double salary, String jobTitle) {
     this.name = name;
     this.address = address;
     this.salary = salary;
     this.jobTitle = jobTitle;
 }

 double calculateBonus() {
     return salary * 0.10;
 }

 String generatePerformanceReport() {
     return name + "'s performance is satisfactory.";
 }

 void manageProjects() {
     System.out.println(jobTitle + " is handling basic tasks.");
 }
}

//Subclass: Manager
class Manager extends Employee44 {
 Manager(String name, String address, double salary) {
     super(name, address, salary, "Manager");
 }

 @Override
 double calculateBonus() {
     return salary * 0.25;
 }

 @Override
 void manageProjects() {
     System.out.println(name + " is managing company-wide projects.");
 }
}

//Subclass: Developer
class Developer extends Employee44 {
 Developer(String name, String address, double salary) {
     super(name, address, salary, "Developer");
 }

 @Override
 double calculateBonus() {
     return salary * 0.20;
 }

 @Override
 void manageProjects() {
     System.out.println(name + " is developing features.");
 }
}

//Subclass: Programmer
class Programmer extends Employee44 {
 Programmer(String name, String address, double salary) {
     super(name, address, salary, "Programmer");
 }

 @Override
 double calculateBonus() {
     return salary * 0.15;
 }

 @Override
 void manageProjects() {
     System.out.println(name + " is writing and testing code.");
 }
}

//Test Program
public class Main21 {
 public static void main(String[] args) {
     Employee44 manager = new Manager("Alice", "New York", 80000);
     Employee44 developer = new Developer("Bob", "San Francisco", 70000);
     Employee44 programmer = new Programmer("Charlie", "Seattle", 60000);

     System.out.println(manager.name + "'s Bonus: $" + manager.calculateBonus());
     manager.manageProjects();
     System.out.println(manager.generatePerformanceReport());

     System.out.println(developer.name + "'s Bonus: $" + developer.calculateBonus());
     developer.manageProjects();

     System.out.println(programmer.name + "'s Bonus: $" + programmer.calculateBonus());
     programmer.manageProjects();
 }
}


