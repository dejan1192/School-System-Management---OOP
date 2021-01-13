package model.factory;

import model.SchoolClass;
import model.person.Address;
import model.person.Student;

public class StudentsFactory {

    public static Student createStudent(String name, Address address, SchoolClass schoolClass){
        return new Student(name, address, schoolClass);
    }
}
