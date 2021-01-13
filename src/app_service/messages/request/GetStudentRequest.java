package app_service.messages.request;

import model.SchoolClass;
import model.person.Student;

import java.util.UUID;

public class GetStudentRequest {

    private Student student;




    public GetStudentRequest(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
}
