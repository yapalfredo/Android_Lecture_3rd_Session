package com.example.androidlecture3rdsession;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {

        int expected = 40;
        int actual = Calculator.add(10,30);


        assertEquals(expected,actual);
    }
}