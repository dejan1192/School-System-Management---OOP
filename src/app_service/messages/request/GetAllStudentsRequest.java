package app_service.messages.request;

import model.SchoolClass;

public class GetAllStudentsRequest {

    private SchoolClass schoolClass;

    public GetAllStudentsRequest(){
        this.schoolClass = null;
    }

    public GetAllStudentsRequest(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }
}
