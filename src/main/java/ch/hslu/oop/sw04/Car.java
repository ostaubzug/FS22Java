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
public class Car implements ISwitchable
{
    private boolean isOn = false;
    
    /**
     * isOn wird auf true gesetzt
     */
    @Override
    public void switchOn()
    {
        isOn = true;
    }
    
    /**
     * isOn wird auf false gesetzt
     */
    @Override
    public void switchOff()
    {
        isOn = false;
    }
    
    /**
     * Gibt true zurück falls das Auto eingeschaltet ist.
     * 
     * @return isOn
     */
    @Override
    public boolean isSwitchedOn()
    {
         return isOn;
    }
    
    /**
     * Gibt true zurück falls das Auto ausgeschaltet ist.
     * 
     * @return isOn
     */
    @Override
    public boolean isSwitchedOff()
    {
        return isOn;
    }
    
}
