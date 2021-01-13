package app_service.messages.request.teacher;

import model.SchoolClass;
import model.person.Teacher;

public class SetClassElderRequest {

    private Teacher teacher;
    private SchoolClass schoolClass;

    public SetClassElderRequest(Teacher t, SchoolClass sc) {
        this.teacher = t;
        this.schoolClass = sc;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher t) {
        this.teacher = t;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }
}
