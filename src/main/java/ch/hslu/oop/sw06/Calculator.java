package ch.hslu.oop.sw06;

public class Calculator implements Icalculator {

    @Override
    public long addition(final int x, final int y) {
        return (long) x + y;
    }
   
}
