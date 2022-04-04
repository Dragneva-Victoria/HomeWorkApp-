package com.company.lesson6homework;

public class Cat extends Animal{

    public Cat(int maxRun, int maxSwin) {
        super(maxRun, maxSwin);
    }

    @Override
    public boolean run(int distance) {
        if (distance < this.maxRun){
            System.out.println("Кошка пробежала " + distance + " метров");
            return true;
        }
        System.out.println("Кошка пробежала меньше " + distance+ " метров ");
        return false;
    }

    @Override
    public boolean swin(int distance) {
        System.out.println("Кошка не умеет плавать");
        return false;
    }
}
