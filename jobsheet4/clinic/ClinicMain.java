public class ClinicMain {
    public static void main(String[] args) {
        // Pasien 1
        Patient patient = new Patient("Alice", 30);
        Doctor doctor = new Doctor("Dr. Bob", "Cardiologist");
        Polyclinic polyclinic = new Polyclinic("Central Health Clinic");

        polyclinic.addDoctor(doctor);

        Examination examination = new Examination(patient, doctor, polyclinic, "Heart Arrhythmia", "2024-09-17");

        patient.addExamination(examination);
        doctor.addExamination(examination);

        System.out.println(examination.getDetails());
        
        // Pasien 2
        Patient patient2 = new Patient("Azaria", 18);
        Doctor doctor2 = new Doctor("Dr. Kayla", "Imunologi");

        polyclinic.addDoctor(doctor2);

        Examination examination2 = new Examination(patient2, doctor2, polyclinic, "Alergic of Antibiotic", "2024-09-27");

        patient2.addExamination(examination2);
        doctor2.addExamination(examination2);

        System.out.println(examination2.getDetails());
    }
}
