package ch.hslu.oop.sw08;

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
        assertEquals(12, temparature.getCelsius() );
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

    @Test
    public void testcomparableSmaller(){
        Temparature temparature1 = new Temparature(2);
        Temparature temparature2 = new Temparature(5);
        assertEquals(-1, temparature1.compareTo(temparature2));
    }

    @Test
    public void testcomparableLarger(){
        Temparature temparature1 = new Temparature(12);
        Temparature temparature2 = new Temparature(5);
        assertEquals(1, temparature1.compareTo(temparature2));
    }

    @Test
    public void testcomparableSame(){
        Temparature temparature1 = new Temparature(5);
        Temparature temparature2 = new Temparature(5);
        assertEquals(0, temparature1.compareTo(temparature2));
    }

    @Test
    public void testConvertKelvintoCelsius(){
        assertEquals(-273.15f, Temparature.convertKelvinToCelsius(0));
    }

    //TODO Wie bringe ich diesen Test zum Laufen ?
    @Test
    public void testConvertKelvinintoCelsius(){
        assertEquals(74.85f, Temparature.convertKelvinToCelsius(348f));
    }

    @Test
    public void testConvertCelsiusIntoKelvin(){
        assertEquals(273.15f, Temparature.convertCelsiusToKelvin(0f));
    }

    @Test
    public void testConvertCelsiusIntoKelvin2(){
        assertEquals(285.15f, Temparature.convertCelsiusToKelvin(12f));
    }

    @Test
    public void testGetKelvin(){
        Temparature temparature = new Temparature(0f);
        assertEquals(273.15f, temparature.getKelvin());
    }

    @Test
    public void testGetCelsius(){
        Temparature temparature = new Temparature(0f);
        assertEquals(0f, temparature.getCelsius());
    }

    @Test
    public void testIncreaseTemperature(){
        Temparature temparature = new Temparature(0f);
        temparature.increaseTemperatureCelsius(12f);
        assertEquals(12f, temparature.getCelsius());
    }

    @Test
    public void testDecreaseTemperature(){
        Temparature temparature = new Temparature(0f);
        temparature.decreaseTemperatureCelsius(12f);
        assertEquals(-12f, temparature.getCelsius());
    }

    @Test
    public void testSetKelvin(){
        Temparature temparature = new Temparature(0f);
        temparature.setKelvin(12f);
        assertEquals(12f, temparature.getKelvin());
    }

    @Test
    public void testSetCelsius(){
        Temparature temparature = new Temparature(0f);
        temparature.setCelsius(12f);
        assertEquals(12f, temparature.getCelsius());
    }
}
