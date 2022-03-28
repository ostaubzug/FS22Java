
package ch.hslu.oop.sw05;

public class Temparatur
{
    private float temperatureCelsius;

    public Temparatur(float input)
    {
        temperatureCelsius = input;
    }

    public float getTemperatureKelvin()
    {
        return temperatureCelsius + 273.15f;
    }
}

