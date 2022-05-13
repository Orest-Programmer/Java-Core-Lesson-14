package ua.lviv.lgs;

import java.util.*;

public class Aplication {
    public static void main(String[] args) {
        Set<Person> setOfPerson = new TreeSet<>(new PersonAllFieldsComparator());
        setOfPerson.add(new Person("Orest", 20));
        setOfPerson.add(new Person("Orest", 30));
        setOfPerson.add(new Person("Andrew", 41));
        setOfPerson.add(new Person("Oleh", 22));

        for (Person p : setOfPerson){
            System.out.println(p);
        }


    }
}
