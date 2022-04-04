package com.company.lesson6homework;

public class Dog extends Animal{

    public Dog(int maxRun, int maxSwin) {
        super(maxRun, maxSwin);
    }

    @Override
    public boolean run(int distance) {
        if (distance < this.maxRun){
            System.out.println("Собака пробежала " + distance + " метров");
            return true;
        }
        System.out.println("Собака пробежала меньше " + distance + " метров ");
        return false;
    }

    @Override
    public boolean swin(int distance) {
        if (distance < this.maxSwin){
            System.out.println("Собака проплыла " + distance + " метров");
            return true;
        }
        System.out.println("Собака проплыла меньше " + distance + " метров ");
        return false;

        }
   }
