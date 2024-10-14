import java.util.ArrayList;
import java.util.List;

public class Professor extends Person {
    double salary;

    public Professor(String name, String phoneNumber, String emailAddress, Address address, double salary) {
        super(name, phoneNumber, emailAddress, address);
        this.salary = salary;
    }

    public void displayPersonDetails() {
        super.displayPersonDetails();
        System.out.println("Salary         : Rp." + salary);
    }
}
