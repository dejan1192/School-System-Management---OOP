package repository;

import model.Subject;

import java.util.ArrayList;

public class SubjectRepository implements ISubjectRepository {

    ArrayList<Subject> subjects = new ArrayList<>();

    @Override
    public void add(Subject object) {
        subjects.add(object);
    }

    @Override
    public ArrayList<Subject> getAll() {
        return subjects;
    }

    @Override
    public Subject find(String obj) throws Exception {
       Subject sub = subjects.stream().filter(s-> s.getName().toLowerCase().equals(obj.toLowerCase())).findAny().orElse(null);
       if(sub == null){
           throw new Exception("Subject does not exist");
       }
       return sub;
    }
}
