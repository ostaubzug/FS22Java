/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw04;

/**
 *
 * @author ostau
 */
public class Engine implements ISwitchable{

private int rpm = 0;
    

    @Override
    public void switchOn()
    {
        rpm = 100;
    }
    

    @Override
    public void switchOff()
    {
        rpm = 0;
    }
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
