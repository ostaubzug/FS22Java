package ch.hslu.oop.sw07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class LeadTest {

    public LeadTest() {
        super();
    }

    @Test
    public void testEqual() {
        EqualsVerifier.forClass(Lead.class).verify();
    }

    @Test
    public void testAggregateSolid(){
        ChemicalElement lead = new Lead();
        String aggregateState = lead.getAggregateState(new Temparature(-212));
        assertEquals("fest", aggregateState);
    }

    @Test
    public void testAggregateLiquid(){
        ChemicalElement lead = new Lead();
        String aggregateState = lead.getAggregateState(new Temparature(900));
        assertEquals("flüssig", aggregateState);
    }

    @Test
    public void testAggregateGaseous(){
        ChemicalElement lead = new Lead();
        String aggregateState = lead.getAggregateState(new Temparature(1800));
        assertEquals("gasförmig", aggregateState);
    }

    
    @Test
    public void testEqualsTrue(){
        ChemicalElement element1 = new Lead();
        ChemicalElement element2 = new Lead();
        assertEquals(element1, element2);
    }
}
