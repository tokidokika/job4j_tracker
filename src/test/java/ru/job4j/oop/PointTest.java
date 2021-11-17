package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when10to15then5() {
        double expected = 5;
        Point a = new Point(1, 0);
        Point b = new Point(1, 5);
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when50to25then5() {
        double expected = 7.0;
        Point a = new Point(1, 6, 2);
        Point c = new Point(3, 0, 5);
        double rsl = c.distance3d(a);
        Assert.assertEquals(expected, rsl, 0.1);
    }
}