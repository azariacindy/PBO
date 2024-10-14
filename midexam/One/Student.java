import java.util.ArrayList;
import java.util.List;

public class Student  extends Person {
    long studentNumber;
    float averageMark;
    List<String> seminarsTaken; // make sure the student does not have a seminar

    public Student(String name, String phoneNumber, String emailAddress, Address address, long studentNumber, float averageMark) {
        super(name, phoneNumber, emailAddress, address); // ensure the person class attribute is correctly initialized in the student object
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
        this.seminarsTaken = new ArrayList<>();
    }

    public void addSeminar(String seminar) {
        seminarsTaken.add(seminar);
    }

    public void displayPersonDetails() {
        super.displayPersonDetails();
        System.out.println("Student Number : " + studentNumber);
        System.out.println("Average Mark   : " + averageMark);
        System.out.println("Seminars Taken : " + seminarsTaken);
    }
}
