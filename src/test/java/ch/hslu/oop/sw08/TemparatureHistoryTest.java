package ch.hslu.oop.sw08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TemparatureHistoryTest {

    public TemparatureHistoryTest() {
        super();
    }


    @Test
    public void testCount(){
        TemparatureHistory tHistory = new TemparatureHistory();
        tHistory.add(new Temperature(12));
        tHistory.add(new Temperature(16));
        tHistory.add(new Temperature(132));
        assertEquals(3, tHistory.getCount());
    }

    @Test
    public void testClear(){
        TemparatureHistory tHistory = new TemparatureHistory();
        tHistory.add(new Temperature(12));
        tHistory.add(new Temperature(16));
        tHistory.add(new Temperature(132));
        tHistory.clear();

        assertEquals(0, tHistory.getCount());
    }

    @Test
    public void testgetMaximum(){
        TemparatureHistory tHistory = new TemparatureHistory();
        Temperature temparature = new Temperature(16);
        tHistory.add(new Temperature(12));
        tHistory.add(new Temperature(16));
        tHistory.add(new Temperature(13));
        assertEquals(temparature, tHistory.getMaximum());
    }

    @Test
    public void testgetMinimum(){
        Temperature temparature = new Temperature(12);
        TemparatureHistory tHistory = new TemparatureHistory();
        tHistory.add(new Temperature(12));
        tHistory.add(new Temperature(16));
        tHistory.add(new Temperature(13));
        assertEquals(temparature, tHistory.getMinimum());
    }

    @Test
    public void testgetAverage(){
        TemparatureHistory tHistory = new TemparatureHistory();
        tHistory.add(new Temperature(-12));
        tHistory.add(new Temperature(16));
        tHistory.add(new Temperature(13));
        tHistory.add(new Temperature(0));
        assertEquals(4.25f, tHistory.getAverage());
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
