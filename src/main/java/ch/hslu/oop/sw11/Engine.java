/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw11;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ostau
 */
public final class Engine implements ISwitchable{

    private int rpm;
    private final List<PropertyChangeListener> changeListeners = new ArrayList<>();
    
    public Engine() {
        rpm = 0;
    }

    public void addPropertyChangeListener(final PropertyChangeListener listener){
        this.changeListeners.add(listener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener listener){
        this.changeListeners.remove(listener);
    }

    @Override
    public void switchOn()
    {
        rpm = 100;
        PropertyChangeEvent event = new PropertyChangeEvent(new Engine(), "rpm", 0, 100);

    }
    

    @Override
    public void switchOff()
    {
        rpm = 0;
    }
    @Override
    public boolean isSwitchedOn()
    {
        if(rpm > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    @Override
    public boolean isSwitchedOff()
    {
        if(rpm <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
