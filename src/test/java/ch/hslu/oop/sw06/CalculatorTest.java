/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.oop.sw06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 *
 * @author ostau
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    @Test
    public void testAdditionNegativePositive() {
        Icalculator calculator = new Calculator();
        long result = calculator.addition(-4, 5);
        assertEquals(1, result);
    }

    @Test
    public void testAdditionNegativeNegative(){
        Calculator calculator = new Calculator();
        long result = calculator.addition(-3, -2);
        assertEquals(-5, result);
    }

    @Test
    public void testAdditionPositivePositive(){
        Icalculator calculator = new Calculator();
        long result = calculator.addition(4, 2);
        assertEquals(6, result);
    }

    @Test
    public void testAdditionZeroZero(){
        Icalculator calculator = new Calculator();
        long result = calculator.addition(0,0);
        assertEquals(0, result);
    }

    @Test
    public void testAdditionOverflow(){
        Icalculator calculator = new Calculator();
        long result = calculator.addition(2_000_000_000,2_000_000_000);
        assertEquals(4_000_000_000L, result);
    }
    
}
