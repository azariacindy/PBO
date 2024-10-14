import java.util.ArrayList;
public class Doctor {
    private String name;
    private String specialization;
    private ArrayList<Examination> examinations = new ArrayList<>();

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void addExamination(Examination exam) {
        examinations.add(exam);
    }

    public ArrayList<Examination> getExaminations() {
        return examinations;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }
}
