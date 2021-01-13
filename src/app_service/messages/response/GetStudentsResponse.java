package app_service.messages.response;

import model.person.Student;

import java.util.ArrayList;

public class GetStudentsResponse extends Response{

    private ArrayList<Student> students= new ArrayList<Student>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
