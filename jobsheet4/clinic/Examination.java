public class Examination {
    private Patient patient;
    private Doctor doctor;
    private Polyclinic policlinic;
    private String diagnosis;
    private String date;

    public Examination(Patient patient, Doctor doctor, Polyclinic policlinic, String diagnosis, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.policlinic = policlinic;
        this.diagnosis = diagnosis;
        this.date = date;
    }

    public String getDetails() {
        System.out.println("--------------------------");
        return "Patient    : " + patient.getName() + "\n" +
               "Age        : " + patient.getAge() + "\n" +
               "Doctor     : " + doctor.getName() + " (" + doctor.getSpecialization() + ")" + "\n" +
               "Polyclinic : " + policlinic.getName() + "\n" +
               "Diagnosis  : " + diagnosis + "\n" +
               "Date       : " + date;
    }
}
