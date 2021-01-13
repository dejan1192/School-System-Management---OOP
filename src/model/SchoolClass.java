package model;


import model.person.Student;
import model.person.Teacher;

import java.util.ArrayList;
import java.util.UUID;

public class SchoolClass {

    private String className;
    private Teacher classElder = null;
    private UUID id;

    ArrayList<Student> studentsInSchoolClass = new ArrayList<Student>();



    public SchoolClass(String className) {
        this.className = className;

        this.id = UUID.randomUUID();
    }

    public ArrayList<Student> getStudentsInSchoolClass() {
        return studentsInSchoolClass;
    }

    public void addToClass(Student student){
        studentsInSchoolClass.add(student);
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "className='" + className + '\'' +
                ", classElder=" + classElder +

                ", id=" + id +
                '}';
    }





    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }



    public Teacher getClassElder() throws Exception {
        if(classElder == null){
            throw new Exception("Class elder not selected.");
        }
        return classElder;
    }

    public void setClassElder(Teacher classElder) {
        this.classElder = classElder;
    }


}
