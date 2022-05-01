/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw11;

public class Light implements ISwitchable
{
    private boolean isOn;
    
    public Light() {
        isOn  = false;
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
}

