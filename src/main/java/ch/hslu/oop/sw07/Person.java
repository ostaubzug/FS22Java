package ch.hslu.oop.sw07;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private final long id;
    private final String name;
    private final String surName;

    public Person(final long id, final String name, final String surName) {
        this.id = id;
        this.name = name;
        this.surName = surName;
    }

    // Todo fragen nächstes mal ob es in Java eine String Interpolation gibt

    // Wichtig fürs Loggen !
    @Override
    public String toString() {
        return "Person [" + this.id + " " + this.name + " " + this.surName + "]";
    }

    // Alternative Lösung nur die Id anschauen
    //Zwei personen Objekte können auf alle Attribute zugreifen, deshalb kann hier surName direkt aufgerufen werden
    @Override
    public final boolean equals(final Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Person p)) {
            return false;
        }
        return (Objects.equals(p.surName, this.surName)) &&
                (Objects.equals(p.name, this.name));
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.name, this.surName);
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    @Override
    public int compareTo(Person person) {
        return Long.compare(this.id, person.id);
    }

}
