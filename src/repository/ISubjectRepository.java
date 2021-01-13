package repository;

import model.Subject;

import java.util.ArrayList;

public interface ISubjectRepository {
    void add(Subject object);
    ArrayList<Subject> getAll();
    Subject find(String object) throws Exception;
}
