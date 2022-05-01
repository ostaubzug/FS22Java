/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw10;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author ostau
 */


public final class Temperature implements Comparable<Temperature>
{
    private static final Logger LOG = LogManager.getLogger(Temperature.class);

    private static final float KELVIN_OFFSET = 273.15f;
    private final float kelvin;

    public static Temperature createFromCelsius(final float celsius){
        if(convertCelsiusToKelvin(celsius) < 0){
            throw new IllegalArgumentException("No Temperature smaller than -273.15C allowed.");
        }
        return new Temperature(convertCelsiusToKelvin(celsius));
    }

    public static Temperature createFromKelvin(final float kelvin){
        if(kelvin < 0){
            throw new IllegalArgumentException("No Tempareture smaller than 0K allowed.");
        }
        
        return new Temperature(kelvin);
    }

    private Temperature(float kelvin)
    {
        this.kelvin = kelvin;
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

