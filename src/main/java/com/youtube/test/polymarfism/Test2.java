package com.youtube.test.polymarfism;
import static
public class Test2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        test(animal);
        test(cat);
        test(dog);

    }

    public static void test(Animal animal) {
        animal.eat();
    }


    }
