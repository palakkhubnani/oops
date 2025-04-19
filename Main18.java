package javacodes;
class Person {
    String getFirstName() {
        return "John";
    }

    String getLastName() {
        return "Doe";
    }
}

class Employee11 extends Person {
    String getEmployeeId() {
        return "EMP123";
    }

    @Override
    String getLastName() {
        return super.getLastName() + " (Software Engineer)";
    }
}

public class Main18 {
    public static void main(String[] args) {
        Employee11 emp = new Employee11();
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
    }
}

