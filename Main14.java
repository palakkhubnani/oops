package javacodes;
class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length = 5;
    double width = 3;

    @Override
    double getArea() {
        return length * width;
    }
}

public class Main14 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println("Area of rectangle: " + rect.getArea());
    }
}
