package javacodes;
class Shape11 {
    double getPerimeter() {
        return 0;
    }

    double getArea() {
        return 0;
    }
}

class Circle extends Shape11 {
    double radius = 7;

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Main19{
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Perimeter of circle: " + circle.getPerimeter());
        System.out.println("Area of circle: " + circle.getArea());
    }
}

