package ch.hslu.oop.sw07;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {


    @Override
    public int compare(Person person1, Person person2) {
        
        int nameSort = person1.getName().compareTo(person2.getName());
        int surnameSort = person1.getSurName().compareTo(person2.getSurName());

        if(surnameSort == 0){
            return nameSort;
        }
        return surnameSort;
    }
    
}
