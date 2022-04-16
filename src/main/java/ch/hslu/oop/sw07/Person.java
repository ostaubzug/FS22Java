package ch.hslu.oop.sw07;

import java.util.Objects;

public final class Person implements Comparable<Person> {

    private final long id;
    private String name;
    private String surName;

    public Person(final long id, final String name, final String surName) {
        this.id = id;
        this.name = name;
        this.surName = surName;
    }

    // Todo gibt es in Java eine String Interpolation ?
    // Wichtig fürs Loggen !
    @Override
    public String toString() {
        return "Person [" + this.id + " " + this.name + " " + this.surName + "]";
    }

    //Zwei personen Objekte können auf alle Attribute zugreifen, deshalb kann hier surName direkt aufgerufen werden
    @Override
    public final boolean equals(final Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Person p)) {
            return false;
        }
        return (Objects.equals(p.id, this.id));
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.id);
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    @Override
    public int compareTo(Person person) {
        return Long.compare(this.id, person.id);
    }

}
