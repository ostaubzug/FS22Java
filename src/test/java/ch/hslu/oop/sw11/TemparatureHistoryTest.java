package ch.hslu.oop.sw11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TemparatureHistoryTest {

    public TemparatureHistoryTest() {
        super();
    }


    @Test
    public void testCount(){
        TemparatureHistory tHistory = new TemparatureHistory();
        tHistory.add(Temperature.createFromKelvin(12));
        tHistory.add(Temperature.createFromKelvin(16));
        tHistory.add(Temperature.createFromKelvin(132));
        assertEquals(3, tHistory.getCount());
    }

    @Test
    public void testClear(){
        TemparatureHistory tHistory = new TemparatureHistory();
        tHistory.add(Temperature.createFromKelvin(12));
        tHistory.add(Temperature.createFromKelvin(16));
        tHistory.add(Temperature.createFromKelvin(132));
        tHistory.clear();

        assertEquals(0, tHistory.getCount());
    }

    @Test
    public void testgetMaximum(){
        TemparatureHistory tHistory = new TemparatureHistory();
        Temperature temparature = Temperature.createFromKelvin(16);
        tHistory.add(Temperature.createFromKelvin(12));
        tHistory.add(Temperature.createFromKelvin(16));
        tHistory.add(Temperature.createFromKelvin(13));
        assertEquals(temparature, tHistory.getMaximum());
    }

    @Test
    public void testgetMinimum(){
        Temperature temparature = Temperature.createFromKelvin(12);
        TemparatureHistory tHistory = new TemparatureHistory();
        tHistory.add(Temperature.createFromKelvin(12));
        tHistory.add(Temperature.createFromKelvin(16));
        tHistory.add(Temperature.createFromKelvin(13));
        assertEquals(temparature, tHistory.getMinimum());
    }

    @Test
    public void testgetAverage(){
        TemparatureHistory tHistory = new TemparatureHistory();
        tHistory.add(Temperature.createFromCelsius(12));
        tHistory.add(Temperature.createFromCelsius(16));
        tHistory.add(Temperature.createFromCelsius(13));
        tHistory.add(Temperature.createFromCelsius(0));
        assertEquals(10.25f, tHistory.getAverage());
    }

    @Test
    public void testgetMaximumNoValue(){
        TemparatureHistory tHistory = new TemparatureHistory();
        assertEquals(null, tHistory.getMaximum());
    }

    @Test
    public void testgetMinimumNoValue(){
        TemparatureHistory tHistory = new TemparatureHistory();
        assertEquals(null, tHistory.getMinimum());
    }

    @Test
    public void testgetAverageNoValue(){
        TemparatureHistory tHistory = new TemparatureHistory();
        assertEquals(Float.NaN, tHistory.getAverage());
    }


}
