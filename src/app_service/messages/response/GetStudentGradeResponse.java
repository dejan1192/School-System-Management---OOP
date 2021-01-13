package app_service.messages.response;

import model.Grade;

import java.util.ArrayList;

public class GetStudentGradeResponse  extends  Response{

    private ArrayList<Grade> grades = new ArrayList<Grade>();

    public GetStudentGradeResponse() {

    }

    public ArrayList<Grade> getGrades() {
        return this.grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }
}
