package pl.javastart.task;

import pl.javastart.task.exceptions.IncorrectAgeException;
import pl.javastart.task.exceptions.NameUndefinedException;

public class Main {

    public static void main(String[] args) {
        try {
//            Person person = new Person("Jan", null, 25, "1234567890");
//            System.out.println(person);
            Person person = new Person("Jan", "Kowalski", -20, "1234567890");
            System.out.println(person);
            person.setAge(-10);
            System.out.println(person);
        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}
