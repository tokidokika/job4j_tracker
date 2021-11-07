package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int energy) {
        this.load = energy;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery one = new Battery(20);
        Battery two = new Battery(45);
        System.out.println("battery 1: " + one.load + " and battery 2: " + two.load);
        one.exchange(two);
        System.out.println("battery 1: " + one.load + " and battery 2: " + two.load);
    }
}
