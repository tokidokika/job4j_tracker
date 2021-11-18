package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int back) {
        return max(right, max(left, back));
    }

    public static int max(int one, int two, int three, int four) {
        return max(max(one, two), max(three, four));
    }
}
