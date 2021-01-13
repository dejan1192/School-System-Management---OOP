package app_service;

import app_service.messages.request.school_class.CreateSchoolClassRequest;
import app_service.messages.request.teacher.SetClassElderRequest;
import model.SchoolClass;
import model.StudentService;
import repository.ISchoolClassRepository;
import repository.SchoolClassRepository;

public class SchoolClassService {

    private ISchoolClassRepository schoolClassRepository;

    public SchoolClassService() {
        this.schoolClassRepository = new SchoolClassRepository();
    }

    public SchoolClass getSchoolClass(SchoolClass schoolClass) throws Exception {
        return schoolClassRepository.find(schoolClass);
    }

    public SchoolClass createSchoolClass(CreateSchoolClassRequest request){
        SchoolClass schoolClass = new SchoolClass(request.getName());
        schoolClassRepository.add(schoolClass);
        return schoolClass;

    }

    public void setClassElder(SetClassElderRequest req){
        req.getSchoolClass().setClassElder(req.getTeacher());
        System.out.println(req.getTeacher() + " set as " + req.getSchoolClass().getClassName() + " class elder.");
    }

    public float calculateGradePointAverageForClass(SchoolClass schoolClass){
        float gpa = StudentService.calculateGradePointAverageForSchoolClass(schoolClass);
        System.out.format("\n***** Class %s has gpa %.2f", schoolClass.getClassName(), gpa);
        return gpa;
    }

    public ISchoolClassRepository getSchoolClassRepository() {
        return schoolClassRepository;
    }
}
