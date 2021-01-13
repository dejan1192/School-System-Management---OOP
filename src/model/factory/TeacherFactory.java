package model.factory;

import model.person.Address;
import model.person.Teacher;

public class TeacherFactory {

    public static Teacher createTeacher(String name, Address address, String subject){
        return new Teacher(name,address, subject);
    }
}
