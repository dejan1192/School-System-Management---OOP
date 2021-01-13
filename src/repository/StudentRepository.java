package repository;

import model.person.Student;

import java.util.ArrayList;

public class StudentRepository implements IStudentRepository {

    ArrayList<Student> students = new ArrayList<Student>();

    @Override
    public String toString() {
        return "StudentRepository{" +
                "students=" + students +
                '}';
    }

    public StudentRepository() {}

    @Override
    public void add(Student object) {


        students.add((Student) object);
    }


    @Override
    public ArrayList<Student> getAll() {
        return  students;
    }


    public int getNumberOfStudents(){
        return students.size();
    }

    @Override
    public Student find(Student object) throws Exception {
       Student student =  students.stream().filter(s-> s.getId() == object.getId()).findFirst().orElse(null);
       if(student == null){
           throw new Exception("Failed to find student..");
       }
       return student;
    }
}
