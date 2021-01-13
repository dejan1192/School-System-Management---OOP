package model.person;

import model.Grade;
import model.SchoolClass;

import java.util.ArrayList;

public class Student extends Person   {

    private SchoolClass schoolClass;
    private ArrayList<Grade> grades = new ArrayList<Grade>();


    public Student(String name, Address address, SchoolClass schoolClass) {
        super(name, address);
        this.schoolClass = schoolClass;
    }

    @Override
    public String toString() {
        return super.toString()  +
         "Student{" +
                "schoolClass=" + schoolClass +
                ", grades=" + grades +
                '}';
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrade(Grade grade){
        this.grades.add(grade);
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }
}
