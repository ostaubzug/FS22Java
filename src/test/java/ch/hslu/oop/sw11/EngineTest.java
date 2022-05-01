package ch.hslu.oop.sw11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EngineTest {

    public EngineTest() {
        super();
    }

    @Test
    public void testConstructor(){
        Engine engine = new Engine();
        assertEquals(engine.isSwitchedOn(), false);
        assertEquals(engine.isSwitchedOff(),true);
    }

    @Test
    public void testSwitchOn(){
        Engine engine = new Engine();
        engine.switchOn();
        assertEquals(engine.isSwitchedOn(), true);
        assertEquals(engine.isSwitchedOff(),false);
    }

    @Test
    public void testSwitchOff(){
        Engine engine = new Engine();
        engine.switchOff();
        assertEquals(engine.isSwitchedOn(), false);
        assertEquals(engine.isSwitchedOff(),true);
    }

}
