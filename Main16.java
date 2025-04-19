package javacodes;
class Animal2 {
    void move() {
        System.out.println("Animal moves");
    }
}

class Cheetah extends Animal2 {
    @Override
    void move() {
        System.out.println("Cheetah runs fast");
    }
}

public class Main16{
    public static void main(String[] args) {
        Cheetah cheetah = new Cheetah();
        cheetah.move();
    }
}
