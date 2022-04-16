package ch.hslu.oop.sw07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
        String aggregateState = mercury.getAggregateState(new Temparature(-40));
        assertEquals("fest", aggregateState);
    }

    @Test
    public void testAggregateLiquid(){
        ChemicalElement mercury = new Mercury();
        String aggregateState = mercury.getAggregateState(new Temparature(12));
        assertEquals("flüssig", aggregateState);
    }

    @Test
    public void testAggregateGaseous(){
        ChemicalElement mercury = new Mercury();
        String aggregateState = mercury.getAggregateState(new Temparature(360));
        assertEquals("gasförmig", aggregateState);
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
        ChemicalElement element1 = new Lead();
        ChemicalElement element2 = new Lead();
        assertEquals(0, element1.compareTo(element2));
    }







}
