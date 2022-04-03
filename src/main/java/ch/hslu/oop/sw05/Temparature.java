/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw05;

/**
 *
 * @author ostau
 */


public class Temparature
{
    private float temperatureCelsius;

    public Temparature(float input)
    {
        temperatureCelsius = input;
    }

    /**
     * Setzt die Temparatur in Celsius.
     * @param input
     *        The Temparature in float
     */
    public void setTemperatureCelsius(float input)
    {
        temperatureCelsius = input;
    }

    public float getTemperatureCelsius()
    {
        // tragen Sie hier den Code ein
        return temperatureCelsius;
    }

    public float getTemperatureKelvin()
    {
        return temperatureCelsius + 273.15f;
    }
    
    public float getTemperatureFahrenheit()
    {
        return temperatureCelsius * 1.8f + 32f;
    }
    
    public void increaseTemperatureCelsius(float input)
    {
        temperatureCelsius += input;
    }
    
    public void decreaseTemperatureCelsius(float input)
    {
        temperatureCelsius -= input;
    }

    @Override
    public String toString(){
        return "Temperature [Kelvin: " + getTemperatureKelvin() + "]";
    }
}

