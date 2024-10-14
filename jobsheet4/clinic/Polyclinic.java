import java.util.ArrayList;
public class Polyclinic {
    private String name;
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public Polyclinic(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public String getName() {
        return name;
    }
}
