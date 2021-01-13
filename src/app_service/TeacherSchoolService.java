package app_service;


import model.person.Teacher;
import repository.TeacherRepository;

public class TeacherSchoolService {

    private TeacherRepository teacherRepository;

    public TeacherSchoolService() {
        this.teacherRepository = new TeacherRepository();
    }


    public void addTeacher(Teacher t){
        teacherRepository.add(t);
    }



}
