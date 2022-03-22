/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw03;

/**
 *
 * @author ostau
 */


public class Temparatur
{
    private float temperatureCelsius;

    public Temparatur(float input)
    {
        temperatureCelsius = input;
    }
    
    public Temparatur()
    {
        
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
    /**
     * Gibt die Temparatur in Grad Kelvin zurück
     * @return 
     *        float Temparatur Kelvin wird zurückgegeben.
     *
     */
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

    public String getAggregateState(String chemicalSymbol)
    {
        double boilTemperatureKelvin;
        double meltTemperatureKelvin;
        
        switch(chemicalSymbol)
        {
            case "N":
                boilTemperatureKelvin = 77.15;
                meltTemperatureKelvin = 63.05;
                break;
            case "Hg":
                boilTemperatureKelvin = 630.2;
                meltTemperatureKelvin = 234.32;
                break;
            case "Pb":
                boilTemperatureKelvin = 2017;
                meltTemperatureKelvin = 600.61;
                break;
            default:
                //sinnlos
                boilTemperatureKelvin = 100;
                meltTemperatureKelvin = 1;
                break;
        }
        
        if(getTemperatureKelvin() <= meltTemperatureKelvin)
        {
          return "fest";                         
        }
        else if(getTemperatureKelvin() > meltTemperatureKelvin && getTemperatureKelvin() <= boilTemperatureKelvin)
        {
          return "flüssig";                         
        }
        else
        {
            return "gasförmig";
        }
    }
}

