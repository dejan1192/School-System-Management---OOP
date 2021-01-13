package repository;

import model.person.Student;
import model.person.Teacher;

import java.util.ArrayList;

public class TeacherRepository implements ITeacherRepository {

    ArrayList<Teacher> teachers = new ArrayList<Teacher>();

    @Override
    public void add(Teacher object) {
        teachers.add(object);
    }

    @Override
    public ArrayList<Teacher> getAll() {
        return teachers;
    }

    @Override
    public Teacher find(Teacher object) throws Exception {
        return teachers.stream().filter(t-> t.getId().equals(object.getId())).findAny().orElse(null);
    }
}
