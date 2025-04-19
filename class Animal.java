class Animal {
    void move() {
        System.out.println("Animal moves");
    }
}

class Cheetah extends Animal {
    @Override
    void move() {
        System.out.println("Cheetah runs fast");
    }
}