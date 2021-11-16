package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax10To5To7Then10() {
        int left = 10;
        int right = 5;
        int back = 7;
        int result = Max.max(left, right, back);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To4Then4() {
        int left = 2;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To8To17Then17() {
        int left = 1;
        int right = 8;
        int back = 17;
        int result = Max.max(left, right, back);
        int expected = 17;
        Assert.assertEquals(result, expected);
    }
}