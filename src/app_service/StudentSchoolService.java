package app_service;

import app_service.messages.request.GetAllStudentsRequest;
import app_service.messages.request.GetStudentGradesRequest;
import app_service.messages.request.GetStudentRequest;
import app_service.messages.request.SetStudentGradeRequest;
import app_service.messages.response.GetStudentGradeResponse;
import app_service.messages.response.GetStudentResponse;
import app_service.messages.response.GetStudentsResponse;
import model.Grade;
import model.SchoolClass;
import model.StudentService;
import model.person.Student;
import repository.IStudentRepository;
import repository.StudentRepository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class StudentSchoolService {

    private IStudentRepository studentRepository;


    public StudentSchoolService() {
        this.studentRepository = new StudentRepository();

    }

    public StudentSchoolService(IStudentRepository repository){
        this.studentRepository = repository;
    }

    public GetStudentsResponse getStudents(GetAllStudentsRequest request) throws Exception {

        ArrayList<Student> students = studentRepository.getAll();
        GetStudentsResponse response = new GetStudentsResponse();
        response.setSuccess(true);
        response.setStudents(students);
        return response;

    }

    public GetStudentResponse getStudent(GetStudentRequest request) throws Exception {
        GetStudentResponse response = new GetStudentResponse();
        Student student = (Student) studentRepository.find(request.getStudent());
        response.setStudent(student);
        response.setSuccess(true);
        return response;

    }

    public void addStudent(Student student) throws Exception {
        SchoolClass schoolClass = ApplicationSchoolService.getInstance().getSchoolClassService().getSchoolClass(student.getSchoolClass());
        schoolClass.addToClass(student);
        studentRepository.add(student);
    }

    public void setStudentGrade(SetStudentGradeRequest request) throws Exception {
        Student student = (Student) studentRepository.find(request.getStudent());
        Grade grade = new Grade(request.getSubject(), request.getGrade());
        student.setGrade(grade);
        System.out.println("Student: " + request.getStudent().getName() + " got " +"[" +request.getGrade() +"]" + " on subject " + request.getSubject().getName() + " " + new SimpleDateFormat("d/m/y").format(request.getDate()));
    }

    public GetStudentGradeResponse getStudentGrades(GetStudentGradesRequest request) throws Exception {
        GetStudentGradeResponse response = new GetStudentGradeResponse();
        Student student = (Student) studentRepository.find(request.getStudent());
        response.setSuccess(true);
        response.setGrades(student.getGrades());
        return response;
    }

    public float calculateGradePerAverageForStudent(Student student){

        float gpa =  StudentService.calculateGradePointAverageForStudent(student);
        System.out.format("***** Student %s has gpa: %.2f", student.getName(), gpa);
        return gpa;
    }


}
