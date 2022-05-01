package ch.hslu.oop.sw11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LightTest {

    public LightTest() {
        super();
    }

    @Test
    public void testConstructor(){
        Light light = new Light();
        assertEquals(light.isSwitchedOn(), false);
        assertEquals(light.isSwitchedOff(),true);
    }

    @Test
    public void testSwitchOn(){
        Light light = new Light();
        light.switchOn();
        assertEquals(light.isSwitchedOn(), true);
        assertEquals(light.isSwitchedOff(),false);
    }

    @Test
    public void testSwitchOff(){
        Light light = new Light();
        light.switchOff();
        assertEquals(light.isSwitchedOn(), false);
        assertEquals(light.isSwitchedOff(),true);
    }

}
