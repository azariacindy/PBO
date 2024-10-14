import java.time.LocalDate;
import java.util.ArrayList; 
public class Pasien06 {

    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi06> riwayatKonsultasi;

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        String info = "";
        info += "No Rekam Medis: " + this.noRekamMedis + "\n";
        info += "Nama: " + this.nama + "\n";
        if (!riwayatKonsultasi.isEmpty()) {
            info += "Riwayat Konsultasi:\n";
            for (Konsultasi06 konsultasi : riwayatKonsultasi) {
                info += konsultasi.getInfo();
            }
        } else {
            info += "Belum ada riwayat konsultasi";
        }
        info += "\n";
        return info;
    }

    public Pasien06(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<Konsultasi06>();
    }

    public void tambahKonsultasi(LocalDate tanggal, Pegawai06 dokter, Pegawai06 perawat) {
        Konsultasi06 konsultasi = new Konsultasi06();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }
}