import java.time.LocalDate;
public class Konsultasi06 {
    private LocalDate tanggal;
    private Pegawai06 dokter;
    private Pegawai06 perawat;


    public LocalDate getTanggal() {
        return tanggal;
    }
    
    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }
    
    public Pegawai06 getDokter() {
        return dokter;
    }
    
    public void setDokter(Pegawai06 dokter) {
        this.dokter = dokter;
    }
    
    public Pegawai06 getPerawat() {
        return perawat;
    }
    
    public void setPerawat(Pegawai06 perawat) {
        this.perawat = perawat;
    }
    
    public String getInfo() {
        String info = "";
        info += "\tTanggal: " + tanggal;
        info += ", Dokter: " + dokter.getInfo();
        info += ", Perawat: " + perawat.getInfo();
        info += "\n";
        return info;
    }
}
