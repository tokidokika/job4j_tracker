package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " is flying in the sky.");
    }

    @Override
    public void where() {
        System.out.println(getClass().getSimpleName() + " crosses borders in the sky");
    }
}
