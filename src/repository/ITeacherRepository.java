package repository;



import model.person.Teacher;

import java.util.ArrayList;

public interface ITeacherRepository {



    void add(Teacher object);
    ArrayList<Teacher> getAll();
    Teacher find(Teacher object) throws Exception;
}
