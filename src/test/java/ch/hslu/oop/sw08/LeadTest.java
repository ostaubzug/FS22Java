package ch.hslu.oop.sw08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
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
        Aggregate aggregateState = lead.getAggregateState(new Temperature(-212));
        assertEquals(Aggregate.SOLID, aggregateState);
    }

    @Test
    public void testAggregateLiquid(){
        ChemicalElement lead = new Lead();
        Aggregate aggregateState = lead.getAggregateState(new Temperature(900));
        assertEquals(Aggregate.LIQUID, aggregateState);
    }

    @Test
    public void testAggregateGaseous(){
        ChemicalElement lead = new Lead();
        Aggregate aggregateState = lead.getAggregateState(new Temperature(1800));
        assertEquals(Aggregate.GAS, aggregateState);
    }

    @Test
    public void testEqualsTrue(){
        ChemicalElement element1 = new Lead();
        ChemicalElement element2 = new Lead();
        assertEquals(element1, element2);
    }
    @Test
    public void testAggregateSolidString(){
        ChemicalElement lead = new Lead();
        String aggregateState = lead.getAggregateStateString(new Temperature(-212));
        assertEquals("Pb ist bei -212.0 °C fest", aggregateState);
    }

    @Test
    public void testAggregateLiquidString(){
        ChemicalElement lead = new Lead();
        String aggregateState = lead.getAggregateStateString(new Temperature(900));
        assertEquals("Pb ist bei 900.0 °C flüssig", aggregateState);
    }

    @Test
    @Disabled
    public void testAggregateGaseousString(){
        ChemicalElement lead = new Lead();
        String aggregateState = lead.getAggregateStateString(new Temperature(1800f));
        assertEquals("Pb ist bei 1800 °C gasförmig", aggregateState);
    }
}
