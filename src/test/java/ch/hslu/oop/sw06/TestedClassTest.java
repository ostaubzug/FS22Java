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
public class TestedClassTest {
    
    public TestedClassTest() {
    }

    @Test
    public void getMaximumTestSecondLarger() {
        TestedClass testedClass = new TestedClass();
        int x = testedClass.getMaximum(4, 6);
        assertEquals(6, x);
       }

    @Test
    public void getMaximumTestFirstLarber() {
        TestedClass testedClass = new TestedClass();
        int x = testedClass.getMaximum(8, -4);
        assertEquals(8, x);
       }

    @Test
    public void getMaximumTestEquals() {
        TestedClass testedClass = new TestedClass();
        int x = testedClass.getMaximum(5,5);
        assertEquals(5, x);
       }
    
}
