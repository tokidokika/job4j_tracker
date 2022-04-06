package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " uses railway.");
    }

    @Override
    public void where() {
        System.out.println(getClass().getSimpleName() + " crosses borders on the ground.");
    }
}
