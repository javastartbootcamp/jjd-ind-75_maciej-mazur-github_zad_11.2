package pl.javastart.task;

import pl.javastart.task.exceptions.IncorrectAgeException;
import pl.javastart.task.exceptions.NameUndefinedException;

public class Person {
    private static final int MIN_NAME_LENGTH = 2;
    private static final int MIN_AGE = 1;

    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);

        this.pesel = pesel;
    }

    private boolean isNameCorrect(String name) {
        return name != null && name.length() >= MIN_NAME_LENGTH;
    }

    private boolean isAgeCorrect(int age) {
        return age >= MIN_AGE;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (!isNameCorrect(firstName)) {
            throw new NameUndefinedException("First name " + firstName + " is incorrect");
        }

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (!isNameCorrect(lastName)) {
            throw new NameUndefinedException("Last name " + lastName + " is incorrect");
        }

        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (!isAgeCorrect(age)) {
            throw new IncorrectAgeException("Provided age " + age + " is incorrect.");
        }

        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
