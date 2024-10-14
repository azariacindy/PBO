public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public int getLembur() {
        return lembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur; // Overloading
    }

    public double getGaji() {
        return super.getGaji() + lembur * gajiLembur; // Overriding
    }

    public void lihatInfo() {
        System.out.println("NIP: " + this.getNip());
        System.out.println("Nama: " + this.getNama());
        System.out.println("Golongan: " + this.getGolongan());
        System.out.printf("Jml Lembur: %d\n", this.getLembur()); // Menggunakan %d untuk int
        System.out.printf("Gaji Lembur: %.0f\n", this.getGajiLembur()); // Tetap menggunakan %.0f untuk double
        System.out.printf("Gaji: %.0f\n", this.getGaji());
    }
}
