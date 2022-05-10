/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw11;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author ostau
 */

/**
 * Beschreiben Sie hier die Klasse Engine.
 * 
 * @author Oliver Staub
 * @version 20.03.2022
 */
public final class Car implements ISwitchable, PropertyChangeListener
{
    private boolean isOn;
    private static final Logger LOG = LogManager.getLogger(Car.class);
    
    public Car() {

    }

    @Override
    public void switchOn()
    {
        isOn = true;
    }
    
    @Override
    public void switchOff()
    {
        isOn = false;
    }
    
    @Override
    public boolean isSwitchedOn()
    {
         return isOn;
    }
    
    @Override
    public boolean isSwitchedOff()
    {
        return !isOn;
    }

    @Override
    public void propertyChange(final PropertyChangeEvent event) {
        LOG.info("Event empfangen"+ event.getSource() + " "+event.getNewValue() + " " + event.getPropertyName());        
    }
    
}
