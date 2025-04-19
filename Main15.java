package javacodes;

class Employee {
    void work() {
        System.out.println("Employee working");
    }

    double getSalary() {
        return 30000;
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HRManager is managing employees");
    }

    void addEmployee() {
        System.out.println("New employee added");
    }
}

public class Main15{
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: " + hr.getSalary());
        hr.addEmployee();
    }
}

