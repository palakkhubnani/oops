class Person {
    String getFirstName() {
        return "John";
    }

    String getLastName() {
        return "Doe";
    }
}

class Employee extends Person {
    String jobTitle = "Manager";

    @Override
    String getLastName() {
        return super.getLastName() + " - " + jobTitle;
    }
}