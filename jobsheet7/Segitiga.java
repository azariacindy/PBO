public class Segitiga {
    // Atribut
    private int sudut;

    // Method overloading untuk menghitung total sudut
    public int totalSudut(int sudutA) {
        // Menghitung sudut total segitiga berdasarkan satu sudut yang diketahui
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        // Menghitung sudut total segitiga berdasarkan dua sudut yang diketahui
        return 180 - (sudutA + sudutB);
    }

    // Method overloading untuk menghitung keliling segitiga dengan dua cara
    public int keliling(int sisiA, int sisiB, int sisiC) {
        // Menghitung keliling segitiga berdasarkan panjang tiga sisi
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        // Menghitung sisi miring segitiga siku-siku menggunakan Teorema Pythagoras
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        // Contoh pemanggilan metode totalSudut
        System.out.println("Total sudut (dengan sudutA): " + segitiga.totalSudut(60));
        System.out.println("Total sudut (dengan sudutA dan sudutB): " + segitiga.totalSudut(60, 40));

        // Contoh pemanggilan metode keliling
        System.out.println("Keliling (dengan tiga sisi): " + segitiga.keliling(3, 4, 5));
        System.out.println("Keliling (sisi miring dari dua sisi): " + segitiga.keliling(3, 4));
    }
}
