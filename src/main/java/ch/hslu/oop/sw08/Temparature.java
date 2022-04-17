/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw08;

import java.util.Objects;

/**
 *
 * @author ostau
 */


public final class Temparature implements Comparable<Temparature>
{
    private static final float kelvinOffset = 273.15f;
    private float kelvin;


    public Temparature(float celsius)
    {
        kelvin = convertCelsiusToKelvin(celsius);
    }

    /**
     * Setzt die Temparatur in Celsius.
     * @param input
     *        The Temparature in float
     */
    public void setTemperatureCelsius(float celsius)
    {
        kelvin = convertCelsiusToKelvin(celsius);
    }

    public float getCelsius()
    {
        return convertKelvinToCelsius(kelvin);
    }

    public float getKelvin()
    {
        return kelvin;
    }

    public void setKelvin(float kelvin)
    {
        this.kelvin = kelvin;
    }

    public void setCelsius(float celsius)
    {
        this.kelvin = convertCelsiusToKelvin(celsius);
    }
    
    public void increaseTemperatureCelsius(float input)
    {
        kelvin += input;
    }
    
    public void decreaseTemperatureCelsius(float input)
    {
        kelvin -= input;
    }

    @Override
    public String toString(){
        return "Temperature [Kelvin: " + getKelvin() + "]";
    }

    @Override
    public final boolean equals(final Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Temparature p)) {
            return false;
        }
        return (Objects.equals(p.kelvin, this.kelvin));
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.kelvin);
    }

    @Override
    public int compareTo(Temparature temparature) {
        return Float.compare(this.kelvin, temparature.kelvin );
    }

    public static float convertKelvinToCelsius(float kelvin){
        return kelvin - kelvinOffset;
    }

    public static float convertCelsiusToKelvin(float celsius){
        return (celsius + kelvinOffset);
    }
}

