class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Cat says meow meow");
    }
}

public class Class {
    public static void main(String[] args) {
        Animal a = new Dog();

      Animal b= new Cat();

        // Downcasting
        if (b instanceof Cat) {
          Cat d = (Cat) b;
            d.meow();
        } else {
            System.out.println("The object is not a Dog");
        }
    }
}