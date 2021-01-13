package app_service.messages.request.school_class;

public class CreateSchoolClassRequest {

    private String name;


    public CreateSchoolClassRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
