package pck;

import java.time.LocalDate;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public abstract float getIncome();
}
