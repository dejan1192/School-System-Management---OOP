package model;

import java.util.Date;

public class Grade {

    private Subject subject;
    private int grade;
    private Date date;

    public Grade(Subject subject, int grade) {
        this.subject = subject;
        this.grade = grade;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Grade{" +
                "subject='" + subject + '\'' +
                ", grade=" + grade +
                ", date=" + date +
                '}';
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) throws Exception {
        if(grade > 5 || grade <= 0){
           throw new Exception("Invalid grade format");
        }
        this.grade = grade;
    }
}
