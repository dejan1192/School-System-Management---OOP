package app_service;


import model.School;
import model.SchoolClass;
import model.Subject;
import repository.ISubjectRepository;
import repository.SubjectRepository;

import java.util.ArrayList;

public class ApplicationSchoolService {

    private School school;

    private static ApplicationSchoolService serviceInstance = null;

    //SchoolClass service
    private SchoolClassService schoolClassService;

    //Student service
    private StudentSchoolService studentSchoolService;

    //Subject repository
    private ISubjectRepository subjectRepository;

    public static ApplicationSchoolService getInstance(){
        if(serviceInstance == null){
            serviceInstance = new ApplicationSchoolService();
        }
        return serviceInstance;
    }


    private ApplicationSchoolService() {

        this.school = new School();
        this.studentSchoolService = new StudentSchoolService();
        this.schoolClassService = new SchoolClassService();
        this.subjectRepository = new SubjectRepository();

    }

    public School getSchool() {
        return school;
    }
    public Subject getSubject(String subjectName) throws Exception {
        return subjectRepository.find(subjectName);

    }

    public SchoolClass getSchoolClassByName(String className){
        return schoolClassService.getSchoolClassRepository().findByName(className);
    }

    public void addSubject(Subject subject){
        subjectRepository.add(subject);
    }

    public ArrayList<Subject> subjectList(){
       return subjectRepository.getAll();
    }





    public SchoolClassService getSchoolClassService() {
        return schoolClassService;
    }

    public StudentSchoolService getStudentSchoolService() {
        return studentSchoolService;
    }
}
