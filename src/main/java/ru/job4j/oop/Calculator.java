package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int b) {
        return x / b;
    }

    public int sumAllOperation(int c) {
        return sum(c) + minus(c) + multiply(c) + divide(c);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        int result = Calculator.sum(10);
        int divRsl = calculator.divide(2);
        int minRsl = Calculator.minus(10);
        int sumAll = calculator.sumAllOperation(3);
        System.out.println(rsl + " " + result);
        System.out.println(divRsl + " " + minRsl);
        System.out.println("Сумма всех операций " + sumAll);
    }
}
