import pck.GenderType;
import pck.MultiRolePerson;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        MultiRolePerson john = new MultiRolePerson("John", "Smith", LocalDate.of(1995, 5, 20));
        john.addStudentRole(1234, 1500.0f);
        System.out.println("Income as student: " + john.getIncome());

        john.addEmployeeRole(true, 3500.0f); // dynamiczne dodanie nowej roli
        System.out.println("Income as working student: " + john.getIncome());
    }
}