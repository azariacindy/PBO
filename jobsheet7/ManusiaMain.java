public class ManusiaMain {
    public static void main(String[] args) {
        // Membuat objek Manusia, Dosen, dan Mahasiswa
        Manusia manusia = new Manusia();
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();

        // Memanggil method bernapas (tidak dioverride)
        manusia.bernafas();
        dosen.bernafas();
        mahasiswa.bernafas();

        // Memanggil method makan (overriding)
        manusia.makan();
        dosen.makan();  // Method makan di-override di Dosen
        mahasiswa.makan();  // Method makan di-override di Mahasiswa

        // Memanggil method khusus Dosen dan Mahasiswa
        dosen.lembur();
        mahasiswa.tidur();
    }
}
