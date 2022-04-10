/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.oop.sw07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

/**
 *
 * @author ostau
 */
public class PointTest {

    public PointTest() {
    }

    @Test
    public void testConstructor() {
        Point point = new Point(12, 2);
        assertEquals(12, point.getX());
        assertEquals(2, point.getY());
    }

    @Test
    public void testEqual() {
        EqualsVerifier.forClass(Point.class).suppress
        (Warning.ALL_FIELDS_SHOULD_BE_USED,Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void testEqualsFalse() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(2, 1);
        assertEquals(false, point1.equals(point2));
    }

    @Test
    public void testEqualsTrue() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        assertEquals(true, point1.equals(point2));
    }

    @Test
    public void testHashSimilar() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        assertEquals(point1.hashCode(), point2.hashCode());
    }

    @Test
    // SHOULD run but does not have to
    public void testHashDifferent() {
        Point point1 = new Point(1, 3);
        Point point2 = new Point(1, 2);
        assertNotEquals(point1.hashCode(), point2.hashCode());
    }

}
