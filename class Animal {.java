class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
   }
}