package ch.hslu.oop.sw08;

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
        Aggregate aggregateState = nitrogen.getAggregateState(new Temperature(-212));
        assertEquals(Aggregate.SOLID, aggregateState);
    }

    @Test
    public void testAggregateLiquid(){
        ChemicalElement nitrogen = new Nitrogen();
        Aggregate aggregateState = nitrogen.getAggregateState(new Temperature(-200));
        assertEquals(Aggregate.LIQUID, aggregateState);
    }

    @Test
    public void testAggregateGaseous(){
        ChemicalElement nitrogen = new Nitrogen();
        Aggregate aggregateState = nitrogen.getAggregateState(new Temperature(-180));
        assertEquals(Aggregate.GAS, aggregateState);
    }

    
    @Test
    public void testEqualsTrue(){
        ChemicalElement element1 = new Nitrogen();
        ChemicalElement element2 = new Nitrogen();
        assertEquals(element1, element2);
    }

    @Test
    public void testAggregateSolidString(){
        ChemicalElement nitrogen = new Nitrogen();
        String aggregateState = nitrogen.getAggregateStateString(new Temperature(-212));
        assertEquals("NB ist bei -212.0 °C fest", aggregateState);
    }

    @Test
    public void testAggregateLiquidString(){
        ChemicalElement nitrogen = new Nitrogen();
        String aggregateState = nitrogen.getAggregateStateString(new Temperature(-200));
        assertEquals("NB ist bei -200.0 °C flüssig", aggregateState);
    }

    @Test
    public void testAggregateGaseousString(){
        ChemicalElement nitrogen = new Nitrogen();
        String aggregateState = nitrogen.getAggregateStateString(new Temperature(-180));
        assertEquals("NB ist bei -180.0 °C gasförmig", aggregateState);
    }







}
