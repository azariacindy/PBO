package jobsheet3;

public class MotorEn06 {
    private String platNomor;
    private boolean isMesin;
    private int kecepatan;

    public void displayStatus(){
        System.out.println("Plat Nomor: " + this.platNomor);

        if (isMesin){
            System.out.println("Mesin: ON");
        } else {
            System.out.println("Mesin: OFF");
        }

        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("==========================");
    }

    public String getPlatNomor() {
        return platNomor;
    }
    
    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }
    
    public boolean isIsMesinOn() {
        return isMesin;
    }
    
    public void setIsMesinOn(boolean isMesinOn) {
        this.isMesin = isMesin;
    }
    
    public int getKecepatan() {
        return kecepatan;
    }
    
    // public void setKecepatan(int kecepatan) {
    //     if (!this.isMesin && kecepatan > 0){
    //         System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
    //     } else {
    //         this.kecepatan = kecepatan;
    //     }
    // }

    // public void setKecepatan(int kecepatan) {
    //     if (kecepatan > 100) {
    //         this.kecepatan = 100;
    //         System.out.println("Kecepatan dibatasi sampai 100.");
    //     } else {
    //         this.kecepatan = kecepatan;
    //     }
    // } 

    public void setKecepatan(int kecepatan) {
        if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh negatif.");
            this.kecepatan = 0;  // set kecepatan ke 0 jika negatif
        } else {
            this.kecepatan = kecepatan;
        }
    }
}
