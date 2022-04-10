package ch.hslu.oop.sw07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonComparatorTest {

    public PersonComparatorTest() {
        super();
    }

    @Test
    public void testComparatorsmaller() {
        PersonComparator comparator = new PersonComparator();
        Person person1 = new Person(2, "a", "b");
        Person person2 = new Person(1, "a", "c");
        assertEquals(-1, comparator.compare(person1, person2));
    }

    @Test
    public void testComparatorequal() {
        PersonComparator comparator = new PersonComparator();
        Person person1 = new Person(2, "a", "b");
        Person person2 = new Person(1, "a", "b");
        assertEquals(0, comparator.compare(person1, person2));
    }

    @Test
    public void testComparatorLarger() {
        PersonComparator comparator = new PersonComparator();
        Person person1 = new Person(2, "a", "b");
        Person person2 = new Person(1, "a", "a");
        assertEquals(1, comparator.compare(person1, person2));
    }

    @Test
    public void testComparatorbothEqual() {
        PersonComparator comparator = new PersonComparator();
        Person person1 = new Person(2, "a", "a");
        Person person2 = new Person(1, "a", "a");
        assertEquals(0, comparator.compare(person1, person2));
    }

    @Test
    public void testComparatorbothNameSaller() {
        PersonComparator comparator = new PersonComparator();
        Person person1 = new Person(2, "a", "a");
        Person person2 = new Person(1, "b", "a");
        assertEquals(-1, comparator.compare(person1, person2));
    }

    @Test
    public void testComparatorbothNameLarger() {
        PersonComparator comparator = new PersonComparator();
        Person person1 = new Person(2, "b", "a");
        Person person2 = new Person(1, "a", "a");
        assertEquals(1, comparator.compare(person1, person2));
    }
}
