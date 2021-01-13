package model.person;

public class Teacher extends Person {

    private String subject;

    public Teacher(String name, Address address, String subject) {
        super(name, address);
        this.subject = subject;
    }



    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
