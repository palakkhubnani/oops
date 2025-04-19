class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length = 5;
    double breadth = 4;

    @Override
    double getArea() {
        return length * breadth;
    }
}