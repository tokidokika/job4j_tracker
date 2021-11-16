package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean condition = left > right;
        return condition ? left : right;
    }

    public static int max(int left, int right, int back) {
        boolean condition = right > back;
        return max(condition ? right : back, max(left, back));
    }
}
