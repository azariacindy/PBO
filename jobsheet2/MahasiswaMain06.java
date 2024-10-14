package jobsheet2;

public class MahasiswaMain06 {
    public static void main(String[] args) {
        // instansiasi mhs1
        Mahasiswa06 m1 = new Mahasiswa06(); 
        // inisiasi pada mhs1
        m1.nim = "2341760169"; // assigns a value to the nim attribute then, m1 has nim 2341760169
        m1.nama = "Azaria Cindy Sahasika";
        m1.alamat = "Jl. Jakarta no.14A";
        m1.kelas = "2G";

        m1.displayBiodata(); // calls the display method on the m1 object to display all the biodata information

        // instansiasi mhs2
        Mahasiswa06 m2 = new Mahasiswa06();
        // inisiasi pada mhs2
        m2.nim = "2341760xxx";
        m2.nama = "Budi Santoso";
        m2.alamat = "Jl. Idjen no.22";
        m2.kelas = "2I";

        m2.displayBiodata();

        // instansiasi mhs3
        Mahasiswa06 m3 = new Mahasiswa06();
        // inisiasi pada mhs3
        m3.nim = "2341760xxx";
        m3.nama = "Ayu Sari";
        m3.alamat = "Jl. Bogor no.10";
        m3.kelas = "2H";

        m3.displayBiodata();
    }
}
