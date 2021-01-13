package app_service.messages.request;

import model.Subject;
import model.person.Student;

import java.util.Date;

public class SetStudentGradeRequest {

    private Subject subject;
    private Student student;
    private int grade;
    private Date date;

    public SetStudentGradeRequest(Student student, Subject subject, int grade) {
        this.subject = subject;
        this.grade = grade;
        this.student = student;
        this.date = new Date();


    }

    public Subject getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    public Student getStudent() {
        return student;
    }

    public Date getDate() {
        return date;
    }
}
