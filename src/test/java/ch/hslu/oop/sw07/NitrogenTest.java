package ch.hslu.oop.sw07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class NitrogenTest {

    public NitrogenTest() {
        super();
    }

    @Test
    public void testEqual() {
        EqualsVerifier.forClass(Nitrogen.class).verify();
    }

    @Test
    public void testAggregateSolid(){
        ChemicalElement nitrogen = new Nitrogen();
        String aggregateState = nitrogen.getAggregateState(new Temparature(-212));
        assertEquals("fest", aggregateState);
    }

    @Test
    public void testAggregateLiquid(){
        ChemicalElement nitrogen = new Nitrogen();
        String aggregateState = nitrogen.getAggregateState(new Temparature(-200));
        assertEquals("flüssig", aggregateState);
    }

    @Test
    public void testAggregateGaseous(){
        ChemicalElement nitrogen = new Nitrogen();
        String aggregateState = nitrogen.getAggregateState(new Temparature(-180));
        assertEquals("gasförmig", aggregateState);
    }

    
    @Test
    public void testEqualsTrue(){
        ChemicalElement element1 = new Nitrogen();
        ChemicalElement element2 = new Nitrogen();
        assertEquals(element1, element2);
    }







}
