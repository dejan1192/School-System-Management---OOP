package repository;

import model.SchoolClass;

import java.util.ArrayList;

public interface ISchoolClassRepository {

    void add(SchoolClass object);
    ArrayList getAll();
    SchoolClass find(SchoolClass object) throws Exception;
    SchoolClass findByName(String name);
}
