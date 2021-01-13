package ui;

import app_service.ApplicationSchoolService;
import app_service.messages.request.GetAllStudentsRequest;
import app_service.messages.request.GetStudentRequest;
import app_service.messages.request.SetStudentGradeRequest;
import app_service.messages.request.school_class.CreateSchoolClassRequest;
import app_service.messages.response.GetStudentResponse;
import app_service.messages.response.GetStudentsResponse;
import model.School;
import model.SchoolClass;
import model.Subject;
import model.factory.StudentsFactory;
import model.factory.TeacherFactory;
import model.person.Address;
import model.person.Student;
import model.person.Teacher;
import model.random.RandomParams;
import java.util.ArrayList;
import java.util.Random;

public class Main {


    public static void main(String[] args) throws Exception {



        ApplicationSchoolService service = ApplicationSchoolService.getInstance();

        SchoolClass razred5 = service.getSchoolClassService().createSchoolClass(new CreateSchoolClassRequest(School.RAZRED_5));
        SchoolClass razred6 = service.getSchoolClassService().createSchoolClass(new CreateSchoolClassRequest(School.RAZRED_6));



        String[] initialSubjects = {"Science", "Foreign Languages", "Economics", "Mathematics", "Chemistry", "Geometry", "Physics "};



        ArrayList<Teacher> teachers = generateTeachersAndCreateSubjectsFromList( initialSubjects, service);

        ArrayList<Student> studentList = generateStudents(10, razred5, service);
        ArrayList<Student> studentList2 = generateStudents(10, razred6, service);

        ListStudents(service);

        setRandomGradesForEveryStudent(studentList, service);
        setRandomGradesForEveryStudent(studentList2, service);

        GetStudentResponse studentFoundResponse = service.getStudentSchoolService().getStudent(new GetStudentRequest(studentList.get(2)));

         service.getStudentSchoolService().calculateGradePerAverageForStudent(studentList.get(4));
         service.getSchoolClassService().calculateGradePointAverageForClass(razred5);





    }

    public static void ListStudents(ApplicationSchoolService service) {
        GetAllStudentsRequest request = new GetAllStudentsRequest();
      try{
          GetStudentsResponse response = service.getStudentSchoolService().getStudents(request);
          for (Student student :
                  response.getStudents()) {
              System.out.println("-------------------------");
              System.out.println("Name: " + student.getName() + "\n" + "Address: " + student.getAddress().getCity());
              System.out.println("Street: " + student.getAddress().getStreet());
              System.out.println("Postal code " + student.getAddress().getPostalCode());
              System.out.println("Class: " + student.getSchoolClass().getClassName());

          }

      }catch(Exception e){
          System.out.println(e.getMessage());
        }
    }

    public static void setRandomGradesForEveryStudent (ArrayList<Student> students,ApplicationSchoolService service) throws Exception {
        Random r = new Random();
        for (int i = 0; i < students.size(); i++) {
            String star = "*";
            System.out.println( star.repeat(40));
            SetStudentGradeRequest science = new SetStudentGradeRequest(students.get(i),service.getSubject("science"), r.nextInt(5) +1);
            service.getStudentSchoolService().setStudentGrade(science);

            for (int j = 0; j < service.subjectList().size(); j++) {
                SetStudentGradeRequest subject = new SetStudentGradeRequest(students.get(i), service.subjectList().get(j), r.nextInt(5)+1);
                service.getStudentSchoolService().setStudentGrade(subject);
            }

           


        }
    }

    public static ArrayList<Student>  generateStudents(int number,SchoolClass schoolClass, ApplicationSchoolService service) throws Exception {
        ArrayList<Student> studentList = new ArrayList<>();
        for (int i = 0; i < number; i++) {

            Student student = StudentsFactory.createStudent(RandomParams.generateFullName(), new Address(RandomParams.generateCity(), RandomParams.generateStreet(), RandomParams.generatePostalCode()), schoolClass);
            service.getStudentSchoolService().addStudent(student);
            studentList.add(student);


        }
        System.out.println("Added " + number + " students.");
        return studentList;

    }

    public static ArrayList<Teacher> generateTeachersAndCreateSubjectsFromList( String[] subjects, ApplicationSchoolService service){
        ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
        for (int i = 0; i < subjects.length; i++) {
            Teacher teacher = TeacherFactory.createTeacher(RandomParams.generateFullName(), new Address(RandomParams.generateCity(), RandomParams.generateStreet(), RandomParams.generatePostalCode()), subjects[i]);
            teacherList.add(teacher);
            service.addSubject(new Subject(subjects[i], teacher));
        }

        return teacherList;
    }


}
