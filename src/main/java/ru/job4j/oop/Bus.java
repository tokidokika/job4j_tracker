package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " is riding on highway");
    }

    @Override
    public void where() {
        System.out.println(getClass().getSimpleName() + " moves from city to city");
    }
}
