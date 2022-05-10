/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw11;

import java.util.Objects;

/**
 *
 * @author ostau
 */


public final class Temperature implements Comparable<Temperature>
{

    private static final float KELVIN_OFFSET = 273.15f;
    private final float kelvin;

    private Temperature(float kelvin)
    {
        if(kelvin < 0){
            throw new IllegalArgumentException("No temperature smaller than 0 Kelvin allowed.");
        }
        this.kelvin = kelvin;
    }

    public static Temperature createFromCelsius(final float celsius){
        return new Temperature(convertCelsiusToKelvin(celsius));
    }

    public static Temperature createFromKelvin(final float kelvin){
        return new Temperature(kelvin);
    }

    public float getCelsius()
    {
        return convertKelvinToCelsius(kelvin);
    }

    public float getKelvin()
    {
        return kelvin;
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
        if (!(object instanceof Temperature p)) {
            return false;
        }
        return (Objects.equals(p.kelvin, this.kelvin));
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.kelvin);
    }

    @Override
    public int compareTo(Temperature temparature) {
        return Float.compare(this.kelvin, temparature.kelvin );
    }

    public static float convertKelvinToCelsius(float kelvin){
        return kelvin - KELVIN_OFFSET;
    }

    public static float convertCelsiusToKelvin(float celsius){
        return (celsius + KELVIN_OFFSET);
    }
}

