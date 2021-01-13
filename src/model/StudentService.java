package model;

import model.person.Student;

public class StudentService {



    public static float calculateGradePointAverageForStudent(Student student){
        float totalSum = 0;
        int numOfSubjects = student.getGrades().size();
        for (int i = 0; i < student.getGrades().size(); i++) {

            totalSum += student.getGrades().get(i).getGrade();


        }
        float gpa = totalSum / numOfSubjects;

        return gpa;

    }
    
    public static float calculateGradePointAverageForSchoolClass(SchoolClass schoolClass){
        float totalSum = 0;
        int numberOfStudents = schoolClass.getStudentsInSchoolClass().size();
        for (int i = 0; i < schoolClass.getStudentsInSchoolClass().size(); i++) {

            totalSum += calculateGradePointAverageForStudent(schoolClass.getStudentsInSchoolClass().get(i));


        }

        float classGpa = totalSum / numberOfStudents;
        return classGpa;

    }

}
