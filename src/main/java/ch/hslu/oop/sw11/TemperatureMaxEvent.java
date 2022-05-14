package ch.hslu.oop.sw11;

import java.util.EventObject;

public class TemperatureMaxEvent extends EventObject {

    //private Temperature maxTemperature;

    public TemperatureMaxEvent(Object arg0) {
        super(arg0);
    }

    @Override
    public Object getSource() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

}
