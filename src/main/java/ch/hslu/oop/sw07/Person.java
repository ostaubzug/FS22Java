package ch.hslu.oop.sw07;

import java.util.Objects;

public class Person {

    private final long Id;
    private String name;
    private String surName;

    public Person(long Id, String name, String surName) {
        this.Id = Id;
        this.setName(name);
        this.setSurName(surName);
    }

    @Override
    public String toString(){
        return "Person [" + this.Id + " " + this.name + " " + this.surName + "]";
    }

    @Override
    public boolean equals(final Object object){
        if (object == this){
            return true;
        }      
        if (!(object instanceof Person p)){
            return false;
        }
        //System Null reference Exception? 
        return (Objects.equals(p.surName, this.surName)) &&
                (Objects.equals(p.name, this.name));        
    }

    @Override
    public int hashCode(){
        return 5;
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
        return Id;
    }
    
}
