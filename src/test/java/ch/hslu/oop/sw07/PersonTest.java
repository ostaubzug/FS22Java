package ch.hslu.oop.sw07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class PersonTest {

    public PersonTest() {
    }

    @Test
    public void testConstructor(){
        Person person = new Person(12, "Blocher", "Christoph");
        assertEquals(12, person.getId());
    }

    @Test
    public void testEqual(){
        //EqualsVerifier.forClass(Person.Class).withOnlyTheseFields("id").verify();
        EqualsVerifier.forClass(Person.class).suppress(Warning.ALL_FIELDS_SHOULD_BE_USED).verify();
    }

    @Test
    public void testEqualsFalse(){
        Person person1 = new Person(1, "Christoph", "Blocher");
        Person person2 = new Person(2, "Christoph", "Mörgeli");
        assertEquals(false, person1.equals(person2));
    }

    @Test
    public void testEqualsTrue(){
        Person person1 = new Person(1, "Christoph", "Blocher");
        Person person2 = new Person(2, "Christoph", "Blocher");
        assertEquals(true, person1.equals(person2));
        //Todo wichtig !!! Das geht auch, ist eigentlich einfacher:
        assertEquals(person1, person2);
    }

    @Test
    public void testHashSimilar(){
        Person person1 = new Person(1, "Christoph", "Blocher");
        Person person2 = new Person(2, "Christoph", "Blocher");
        assertEquals(person1.hashCode(),person2.hashCode());
    }

    @Test
    //SHOULD run but does not have to
    public void testHashDifferent(){
        Person person1 = new Person(1, "Christoph", "Blocher");
        Person person2 = new Person(2, "Christoph", "blocher");
        assertNotEquals(person1.hashCode(),person2.hashCode());
    }

    @Test
    public void testcomparableSmaller(){
        Person person1  = new Person(1, "A" , "C");
        Person person2 = new Person(2, "B" ,"D");
        assertEquals(-1, person1.compareTo(person2));
    }

    @Test
    public void testcomparableLarger(){
        Person person1  = new Person(2, "A" , "C");
        Person person2 = new Person(1, "B" ,"D");
        assertEquals(1, person1.compareTo(person2));
    }

    @Test
    public void testcomparableSame(){
        Person person1  = new Person(2, "A" , "C");
        Person person2 = new Person(2, "B" ,"D");
        assertEquals(0, person1.compareTo(person2));
    }
}
