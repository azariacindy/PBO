public class OneMain {
    public static void main(String[] args) {
        // creating an Address object
        Address address1 = new Address("Jl. Jakarta No.14A", "Klojen", "Malang City", "65113", "East Java");
        Address address2 = new Address("Jl. Kawi Atas No.16", "Klojen", "Malang City", "65114", "East Java");

        // creating a Student object
        Student student = new Student("Azaria Cindy Sahasika", "1127-1109-2006", "cindysss099@gmail.com", address1, 2341760169L, 85.5f);
        student.addSeminar("Math Seminar");
        student.addSeminar("Physics Seminar");

        // creating a Professor object
        Professor professor = new Professor("Prof. Sugeng", "1234-1765-4321", "sugengganteng@gail.com", address2, 5000000);

        // display details
        System.out.println("Student Details:");
        student.displayPersonDetails();

        System.out.println("\nProfessor Details:");
        professor.displayPersonDetails();
    }
}
