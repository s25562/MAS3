package pck;

import pck.interfaces.IEmployee;

public class Employee implements IEmployee {
    private boolean medicalTest;
    private float salary;

    public Employee(boolean medicalTest, float salary){
        this.medicalTest = medicalTest;
        this.salary = salary;
    }

    @Override
    public float getSalary(){
        return this.salary;
    }
}
