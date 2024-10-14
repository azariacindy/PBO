package jobsheet3;

public class Motor06 {
    public String platNomor;
    public boolean isMesin;
    public int kecepatan;

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
}
