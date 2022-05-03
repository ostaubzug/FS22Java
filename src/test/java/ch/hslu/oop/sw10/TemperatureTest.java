package ch.hslu.oop.sw10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class TemperatureTest {

    public TemperatureTest() {
    }
    @Test
    public void testConstructorCelsius() {
        Temperature temparature = Temperature.createFromCelsius(12);
        assertEquals(12, temparature.getCelsius() );
    }

    @Test
    public void testConstructorCelsiusIllegalArgument() {
        final Exception e =
        assertThrows(IllegalArgumentException.class, () -> {
            Temperature.createFromCelsius(-274);
        });
        assertThat(e.getMessage()).isEqualTo("No Temperature smaller than -273.15C allowed.");
    }

    @Test
    public void testConstructorKelvinIllegalArgument() {
        final Exception e =
        assertThrows(IllegalArgumentException.class, () -> {
            Temperature.createFromKelvin(-0.1f);
        });
        assertThat(e.getMessage()).isEqualTo("No Tempareture smaller than 0K allowed.");
    }

    @Test
    public void testConstructorKelvin() {
        Temperature temparature = Temperature.createFromKelvin(2000);
        assertEquals(2000, temparature.getKelvin() , 0.15f);
    }

    @Test
    public void testEqual() {
        EqualsVerifier.forClass(Temperature.class).suppress
        (Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void testEqualsFalse() {
        Temperature temparature1 = Temperature.createFromCelsius(2);
        Temperature temparature2 = Temperature.createFromCelsius(3);
        assertEquals(false, temparature1.equals(temparature2));
    }

    @Test
    public void testEqualsTrue() {
        Temperature temparature1 = Temperature.createFromCelsius(1);
        Temperature temparature2 = Temperature.createFromCelsius(1);
        assertEquals(true, temparature1.equals(temparature2));
    }

    @Test
    public void testHashSimilar() {
        Temperature temparature1 = Temperature.createFromCelsius(2);
        Temperature temparature2 = Temperature.createFromCelsius(2);
        assertEquals(temparature1.hashCode(), temparature2.hashCode());
    }

    @Test
    // SHOULD run but does not have to
    public void testHashDifferent() {
        Temperature temparature1 = Temperature.createFromCelsius(1);
        Temperature temparature2 = Temperature.createFromCelsius(2);
        assertNotEquals(temparature1.hashCode(), temparature2.hashCode());
    }

    @Test
    public void testcomparableSmaller(){
        Temperature temparature1 = Temperature.createFromCelsius(2);
        Temperature temparature2 = Temperature.createFromCelsius(5);
        assertEquals(-1, temparature1.compareTo(temparature2));
    }

    @Test
    public void testcomparableLarger(){
        Temperature temparature1 = Temperature.createFromCelsius(12);
        Temperature temparature2 = Temperature.createFromCelsius(5);
        assertEquals(1, temparature1.compareTo(temparature2));
    }

    @Test
    public void testcomparableSame(){
        Temperature temparature1 = Temperature.createFromCelsius(5);
        Temperature temparature2 = Temperature.createFromCelsius(5);
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
        Temperature temparature = Temperature.createFromCelsius(0f);
        assertEquals(273.15f, temparature.getKelvin());
    }

    @Test
    public void testGetCelsius(){
        Temperature temparature = Temperature.createFromCelsius(0f);
        assertEquals(0f, temparature.getCelsius());
    }

}
