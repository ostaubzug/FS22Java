package ch.hslu.oop.sw07;

import java.util.Comparator;

public final class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        
        int nameSort = person1.getName().compareTo(person2.getName());
        int surnameSort = person1.getSurName().compareTo(person2.getSurName());

        //String CompareTo returns the difference in the alphabet
        if(nameSort < 0){
            nameSort = -1;
        }
        else if (nameSort > 0){
            nameSort = 1;
        }
        if(surnameSort < 0){
            surnameSort = -1;
        }
        else if (surnameSort > 0){
            surnameSort = 1;
        } 
        

        if(surnameSort == 0){
            return nameSort;
        }
        return surnameSort;
    }
    
}
