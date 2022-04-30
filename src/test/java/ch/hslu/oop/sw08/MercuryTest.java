package ch.hslu.oop.sw08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class MercuryTest {

    public MercuryTest() {
        super();
    }

    @Test
    public void testEqual() {
        EqualsVerifier.forClass(Mercury.class).verify();
    }

    @Test
    public void testAggregateSolid(){
        ChemicalElement mercury = new Mercury();
        Aggregate aggregateState = mercury.getAggregateState(new Temperature(-40));
        assertEquals(Aggregate.SOLID, aggregateState);
    }

    @Test
    public void testAggregateLiquid(){
        ChemicalElement mercury = new Mercury();
        Aggregate aggregateState = mercury.getAggregateState(new Temperature(12));
        assertEquals(Aggregate.LIQUID, aggregateState);
    }

    @Test
    public void testAggregateGaseous(){
        ChemicalElement mercury = new Mercury();
        Aggregate aggregateState = mercury.getAggregateState(new Temperature(360));
        assertEquals(Aggregate.GAS, aggregateState);
    }

    
    @Test
    public void testEqualsTrue(){
        ChemicalElement element1 = new Mercury();
        ChemicalElement element2 = new Mercury();
        assertEquals(element1, element2);
    }


    @Test
    public void testEqualsNotTrue(){
        ChemicalElement element1 = new Mercury();
        ChemicalElement element2 = new Nitrogen();
        assertNotEquals(element1, element2);
    }

    @Test
    public void testEqualsNotTrue2(){
        ChemicalElement element1 = new Mercury();
        ChemicalElement element2 = new Lead();
        assertNotEquals(element1, element2);
    }

    @Test
    public void compareLarger(){
        ChemicalElement element1 = new Nitrogen();
        ChemicalElement element2 = new Mercury();
        assertEquals(1, element1.compareTo(element2));
    }

    @Test
    public void compareSmaller(){
        ChemicalElement element1 = new Mercury();
        ChemicalElement element2 = new Lead();
        assertEquals(-1, element1.compareTo(element2));
    }

    @Test
    public void compareEqual(){
        ChemicalElement element1 = new Mercury();
        ChemicalElement element2 = new Mercury();
        assertEquals(0, element1.compareTo(element2));
    }

    @Test
    public void testAggregateSolidString(){
        ChemicalElement mercury = new Mercury();
        String aggregateState = mercury.getAggregateStateString(new Temperature(-40));
        assertEquals("Hg ist bei -40.0 °C fest", aggregateState);
    }

    @Test
    public void testAggregateLiquidString(){
        ChemicalElement mercury = new Mercury();
        String aggregateState = mercury.getAggregateStateString(new Temperature(12));
        assertEquals("Hg ist bei 12.0 °C flüssig", aggregateState);
    }

    @Test
    @Disabled
    public void testAggregateGaseousString(){
        ChemicalElement mercury = new Mercury();
        String aggregateState = mercury.getAggregateStateString(new Temperature(360));
        assertEquals("Hg ist bei 360 °C gasförmig", aggregateState);
    }







}
