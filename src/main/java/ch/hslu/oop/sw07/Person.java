package ch.hslu.oop.sw07;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private final long Id;
    private final String name;
    private final String surName;

    public Person(final long Id,final String name,final String surName) {
        this.Id = Id;
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Person [" + this.Id + " " + this.name + " " + this.surName + "]";
    }

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
        return Id;
    }

    @Override
    public int compareTo(Person person) {
        return Long.compare(this.Id, person.Id);
    }

}
