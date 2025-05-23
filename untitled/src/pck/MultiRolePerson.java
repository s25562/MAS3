package pck;

import pck.interfaces.IEmployee;
import pck.interfaces.IStudent;

import java.time.LocalDate;
import java.util.EnumSet;

public class MultiRolePerson extends Person implements IStudent, IEmployee {
    enum Role {Student, Employee};
    private EnumSet<Role> roles;
    private Student student;
    private Employee employee;

    public MultiRolePerson(String firstName, String lastName, LocalDate birthDate){
        super(firstName, lastName, birthDate);
        this.roles = EnumSet.noneOf(Role.class);
    }

    public void addStudentRole(int index, float scholarship){
        this.student = new Student(index, scholarship);
        this.roles.add(Role.Student);
    }

    public void addEmployeeRole(boolean medicalTest, float salary){
        this.employee = new Employee(medicalTest, salary);
        this.roles.add(Role.Employee);
    }

    @Override
    public float getIncome(){
        float income = 0;
        if (this.roles.contains(Role.Student)) income += this.student.getScholarship();
        if (this.roles.contains(Role.Employee)) income += this.employee.getSalary();
        return income;
    }

    @Override
    public float getScholarship(){
        return this.student != null ? this.student.getScholarship() : 0 ;
    }

    @Override
    public float getSalary(){
        return this.employee != null ? this.employee.getSalary() : 0 ;
    }




}
