package repository;

import model.SchoolClass;


import java.util.ArrayList;

public class SchoolClassRepository implements  ISchoolClassRepository {

    ArrayList<SchoolClass> schoolClasses = new ArrayList<SchoolClass>();

    @Override
    public void add(SchoolClass object) {
        System.out.println("Added");
         schoolClasses.add((SchoolClass) object);
    }

    @Override
    public ArrayList<SchoolClass> getAll() {

       return schoolClasses;
    }

    @Override
    public SchoolClass find(SchoolClass object) {

        SchoolClass obj =  schoolClasses.stream().filter(classObject -> classObject.getId().equals(object.getId())).findAny().orElse(null);
        return obj;
    }

    public SchoolClass findByName(String className){
        System.out.println(className);
        return schoolClasses.stream().filter(s-> s.getClassName().toLowerCase().equals(className.toLowerCase())).findAny().orElse(null);

    }
}
