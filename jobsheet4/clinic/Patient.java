import java.util.ArrayList;
public class Patient {

    private String name;
    private int age;
    private ArrayList<Examination> examinations = new ArrayList<>(); // wajib ada karena pasien melakukan pemeriksaan

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addExamination(Examination exam) {
        examinations .add(exam);
    }

    public ArrayList<Examination> getExaminations() {
        return examinations;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
