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
        tHistory.add(new Temparature(12));
        tHistory.add(new Temparature(16));
        tHistory.add(new Temparature(132));
        assertEquals(3, tHistory.getCount());
    }

    @Test
    public void testClear(){
        TemparatureHistory tHistory = new TemparatureHistory();
        tHistory.add(new Temparature(12));
        tHistory.add(new Temparature(16));
        tHistory.add(new Temparature(132));
        tHistory.clear();

        assertEquals(0, tHistory.getCount());
    }

    @Test
    public void testgetMaximum(){
        TemparatureHistory tHistory = new TemparatureHistory();
        Temparature temparature = new Temparature(16);
        tHistory.add(new Temparature(12));
        tHistory.add(new Temparature(16));
        tHistory.add(new Temparature(13));
        assertEquals(temparature, tHistory.getMaximum());
    }

    @Test
    public void testgetMinimum(){
        Temparature temparature = new Temparature(12);
        TemparatureHistory tHistory = new TemparatureHistory();
        tHistory.add(new Temparature(12));
        tHistory.add(new Temparature(16));
        tHistory.add(new Temparature(13));
        assertEquals(temparature, tHistory.getMinimum());
    }

    @Test
    public void testgetAverage(){
        TemparatureHistory tHistory = new TemparatureHistory();
        tHistory.add(new Temparature(-12));
        tHistory.add(new Temparature(16));
        tHistory.add(new Temparature(13));
        tHistory.add(new Temparature(0));
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
