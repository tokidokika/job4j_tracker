package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Go!");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("How many " + passenger);
    }

    @Override
    public double refuel(double fuel) {
        double price = 1;
        return price * fuel;
    }
}
