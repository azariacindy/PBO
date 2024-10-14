import java.time.LocalDate;

public class RSMain06 {
    public static void main(String[] args) {
        Pegawai06 ani = new Pegawai06("1234", "dr. Ani");
        Pegawai06 bagus = new Pegawai06("4567", "dr. Bagus");
        
        Pegawai06 desi = new Pegawai06("1234", "Ns. Desi");
        Pegawai06 eka = new Pegawai06("4567", "Ns. Eka");
        
        Pasien06 pasien1 = new Pasien06("343298", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2021 , 8,11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9,11), bagus, eka);
        
        System.out.println(pasien1.getInfo());
        
        Pasien06 pasien2 = new Pasien06("997744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }
}
