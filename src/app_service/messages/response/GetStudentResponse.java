package app_service.messages.response;

import model.person.Student;

public class GetStudentResponse extends Response {

    private Student student;

    public GetStudentResponse() {}

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
