package experiment2;

public class InheritanceMain {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
    
        dosen1.nama = "Yanasy Kyuningtyas";
        dosen1.nip = "34329837";
        dosen1.gaji = 3000000;
        dosen1.nidn = "1989432439";
    
        System.out.println(dosen1.getInfo());
    }
}
