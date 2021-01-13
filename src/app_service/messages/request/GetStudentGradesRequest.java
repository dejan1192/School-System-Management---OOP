package app_service.messages.request;

import model.person.Student;

public class GetStudentGradesRequest {

    private Student student;

    public GetStudentGradesRequest(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
