package ch.hslu.oop.sw07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class TemparatureTest {

    public TemparatureTest() {
    }
    @Test
    public void testConstructor() {
        Temparature temparature = new Temparature(12);
        assertEquals(12, temparature.getTemperatureCelsius() );
    }

    @Test
    public void testEqual() {
        EqualsVerifier.forClass(Temparature.class).suppress
        (Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void testEqualsFalse() {
        Temparature temparature1 = new Temparature(2);
        Temparature temparature2 = new Temparature(3);
        assertEquals(false, temparature1.equals(temparature2));
    }

    @Test
    public void testEqualsTrue() {
        Temparature temparature1 = new Temparature(1);
        Temparature temparature2 = new Temparature(1);
        assertEquals(true, temparature1.equals(temparature2));
    }

    @Test
    public void testHashSimilar() {
        Temparature temparature1 = new Temparature(2);
        Temparature temparature2 = new Temparature(2);
        assertEquals(temparature1.hashCode(), temparature2.hashCode());
    }

    @Test
    // SHOULD run but does not have to
    public void testHashDifferent() {
        Temparature temparature1 = new Temparature(1);
        Temparature temparature2 = new Temparature(2);
        assertNotEquals(temparature1.hashCode(), temparature2.hashCode());
    }





}
