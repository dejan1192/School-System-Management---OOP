package repository;


import model.person.Student;

import java.util.ArrayList;

public interface IStudentRepository {
    void add(Student object);
    ArrayList<Student> getAll();
    Student find(Student object) throws Exception;
}
