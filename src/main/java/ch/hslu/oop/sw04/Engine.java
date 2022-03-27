/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw04;

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
public class Engine implements ISwitchable
{
    private int rpm = 0;
    
    /**
     * Rpm wird auf 100 gesetzt
     */
    @Override
    public void switchOn()
    {
        rpm = 100;
    }
    
    /**
     * rpm wird auf 0 gesetzt
     */
    @Override
    public void switchOff()
    {
        rpm = 0;
    }
    
    /**
     * Gibt true zurück falls rpm grösser gleich 100.
     * 
     * @return boolean
     *        true falls rmp >= 100
     */
    @Override
    public boolean isSwitchedOn()
    {
        if(rpm >= 100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Gibt true zurück falls rpm kleiner gleich 0 ist.
     * 
     * @return boolean
     *         true falls rpm <= 100
     */
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
