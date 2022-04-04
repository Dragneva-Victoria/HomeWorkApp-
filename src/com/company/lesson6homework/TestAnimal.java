package com.company.lesson6homework;

import java.util.Arrays;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = testAnimal();

        for (Animal animal : animals) {
             animal.run(300);
             animal.swin(10);
        }
    }
    private static Animal [] testAnimal() {
        return new Animal[] {
                new Dog (700, 5),
                new Dog(50, 11),
                new Dog (900, 7),
                new Cat(130, 3),
                new Cat (15,4)
        };
    }
}
