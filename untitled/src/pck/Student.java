package pck;

import pck.interfaces.IStudent;

public class Student implements IStudent {
    private int index;
    private float scholarship;

    public Student(int index, float scholarship){
        this.index = index;
        this.scholarship = scholarship;
    }

    @Override
    public float getScholarship(){
        return scholarship;
    }
}
