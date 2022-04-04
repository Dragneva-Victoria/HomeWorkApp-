package com.company.lesson6homework;

public abstract class Animal {
    protected int maxRun;
    protected int maxSwin;

    public Animal(int maxRun, int maxSwin) {
        this.maxRun = maxRun;
        this.maxSwin = maxSwin;
    }
    public abstract boolean run (int distance);
    public abstract boolean swin (int distance);
}
