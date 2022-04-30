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
        Temperature temparature = new Temperature(12);
        assertEquals(12, temparature.getCelsius() );
    }

    @Test
    public void testEqual() {
        EqualsVerifier.forClass(Temperature.class).suppress
        (Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void testEqualsFalse() {
        Temperature temparature1 = new Temperature(2);
        Temperature temparature2 = new Temperature(3);
        assertEquals(false, temparature1.equals(temparature2));
    }

    @Test
    public void testEqualsTrue() {
        Temperature temparature1 = new Temperature(1);
        Temperature temparature2 = new Temperature(1);
        assertEquals(true, temparature1.equals(temparature2));
    }

    @Test
    public void testHashSimilar() {
        Temperature temparature1 = new Temperature(2);
        Temperature temparature2 = new Temperature(2);
        assertEquals(temparature1.hashCode(), temparature2.hashCode());
    }

    @Test
    // SHOULD run but does not have to
    public void testHashDifferent() {
        Temperature temparature1 = new Temperature(1);
        Temperature temparature2 = new Temperature(2);
        assertNotEquals(temparature1.hashCode(), temparature2.hashCode());
    }

    @Test
    public void testcomparableSmaller(){
        Temperature temparature1 = new Temperature(2);
        Temperature temparature2 = new Temperature(5);
        assertEquals(-1, temparature1.compareTo(temparature2));
    }

    @Test
    public void testcomparableLarger(){
        Temperature temparature1 = new Temperature(12);
        Temperature temparature2 = new Temperature(5);
        assertEquals(1, temparature1.compareTo(temparature2));
    }

    @Test
    public void testcomparableSame(){
        Temperature temparature1 = new Temperature(5);
        Temperature temparature2 = new Temperature(5);
        assertEquals(0, temparature1.compareTo(temparature2));
    }

    @Test
    public void testConvertKelvintoCelsius(){
        assertEquals(-273.15f, Temperature.convertKelvinToCelsius(0f));
    }

    @Test
    public void testConvertKelvintoCelsius2(){
        assertEquals(74.85f, Temperature.convertKelvinToCelsius(348f),0.05f);
    }

    @Test
    public void testConvertCelsiusIntoKelvin(){
        assertEquals(273.15f, Temperature.convertCelsiusToKelvin(0f));
    }

    @Test
    public void testConvertCelsiusIntoKelvin2(){
        assertEquals(285.15f, Temperature.convertCelsiusToKelvin(12f));
    }

    @Test
    public void testGetKelvin(){
        Temperature temparature = new Temperature(0f);
        assertEquals(273.15f, temparature.getKelvin());
    }

    @Test
    public void testGetCelsius(){
        Temperature temparature = new Temperature(0f);
        assertEquals(0f, temparature.getCelsius());
    }

    @Test
    public void testIncreaseTemperature(){
        Temperature temparature = new Temperature(0f);
        temparature.increaseTemperatureCelsius(12f);
        assertEquals(12f, temparature.getCelsius());
    }

    @Test
    public void testDecreaseTemperature(){
        Temperature temparature = new Temperature(0f);
        temparature.decreaseTemperatureCelsius(12f);
        assertEquals(-12f, temparature.getCelsius());
    }

    @Test
    public void testSetKelvin(){
        Temperature temparature = new Temperature(0f);
        temparature.setKelvin(12f);
        assertEquals(12f, temparature.getKelvin());
    }

    @Test
    public void testSetCelsius(){
        Temperature temparature = new Temperature(0f);
        temparature.setCelsius(12f);
        assertEquals(12f, temparature.getCelsius());
    }
}
