package javacodes;
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat says: Bark");
    }
}

public class Main11 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
}

