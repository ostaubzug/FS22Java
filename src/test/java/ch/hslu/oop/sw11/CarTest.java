package ch.hslu.oop.sw11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarTest {

    public CarTest() {
        super();
    }

    @Test
    public void testConstructor(){
        Car car = new Car();
        assertEquals(car.isSwitchedOn(), false);
        assertEquals(car.isSwitchedOff(),true);
    }

    @Test
    public void testSwitchOn(){
        Car car = new Car();
        car.switchOn();
        assertEquals(car.isSwitchedOn(), true);
        assertEquals(car.isSwitchedOff(),false);
    }

    @Test
    public void testSwitchOff(){
        Car car = new Car();
        car.switchOff();
        assertEquals(car.isSwitchedOn(), false);
        assertEquals(car.isSwitchedOff(),true);
    }

}
