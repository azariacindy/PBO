// Superclass Manusia
class Manusia {
    // Method bernapas
    public void bernafas() {
        System.out.println("Manusia bernapas.");
    }

    // Method makan (akan dioverride di subclass)
    public void makan() {
        System.out.println("Manusia makan.");
    }
}

// Subclass Dosen
class Dosen extends Manusia {
    // Override method makan dari superclass Manusia
    @Override
    public void makan() {
        System.out.println("Dosen makan di kantin.");
    }

    // Method lembur khusus untuk Dosen
    public void lembur() {
        System.out.println("Dosen lembur memeriksa tugas mahasiswa.");
    }
}

// Subclass Mahasiswa
class Mahasiswa extends Manusia {
    // Override method makan dari superclass Manusia
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan di warung.");
    }

    // Method tidur khusus untuk Mahasiswa
    public void tidur() {
        System.out.println("Mahasiswa tidur setelah belajar.");
    }
}
