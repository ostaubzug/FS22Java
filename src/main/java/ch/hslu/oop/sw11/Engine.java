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
    private final List<PropertyChangeListener> changeListeners = new ArrayList<PropertyChangeListener>();
    
    public Engine() {
        rpm = 0;
    }

    //TODO Man könnte auch eine Nullpointer/IllegalArgument Exception werfen
    public void addPropertyChangeListener(final PropertyChangeListener listener){
        if(listener != null){
        this.changeListeners.add(listener);
        }
    }

    //TODO Hier ist es egal wenn es ein Null ist
    public void removePropertyChangeListener(final PropertyChangeListener listener){
        if(listener != null){
            this.changeListeners.remove(listener);
        }
    }

    private void firePropertyChangeEvent(final PropertyChangeEvent pcEvent){
        for (final PropertyChangeListener listener : this.changeListeners){
            listener.propertyChange(pcEvent);
        }
    }

    @Override
    public void switchOn()
    {
        rpm = 100;
        firePropertyChangeEvent(new PropertyChangeEvent(this, "rpm", 0, 100));

    }
    

    @Override
    public void switchOff()
    {
        rpm = 0;
        firePropertyChangeEvent(new PropertyChangeEvent(this, "rpm", 100, 0));

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
