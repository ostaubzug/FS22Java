/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw07;

import java.util.Objects;

/**
 *
 * @author ostau
 */


public final class Temparature implements Comparable<Temparature>
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

    @Override
    public final boolean equals(final Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Temparature p)) {
            return false;
        }
        return (Objects.equals(p.temperatureCelsius, this.temperatureCelsius));
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.temperatureCelsius);
    }

    @Override
    public int compareTo(Temparature temparature) {
        return Float.compare(this.temperatureCelsius, temparature.temperatureCelsius );
    }
}

