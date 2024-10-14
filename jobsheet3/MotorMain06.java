package jobsheet3;

public class MotorMain06 {
    public static void main(String[] args) {
        Motor06 mtr1 = new Motor06();
        mtr1.displayStatus();

        mtr1.platNomor = "R 0000 CS";

        int newKecepatan = 80;

        if(!mtr1.isMesin && newKecepatan > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            mtr1.kecepatan = newKecepatan;
        }

        mtr1.displayStatus();

        Motor06 mtr2 = new Motor06();
        mtr2.platNomor = "R 0010 CS";
        newKecepatan = 70;
        
        if(!mtr2.isMesin && newKecepatan > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            mtr1.kecepatan = newKecepatan;
        }

        mtr2.displayStatus();

        Motor06 mtr3 = new Motor06();
        mtr3.platNomor = "X 0900 DS";
        
        newKecepatan = 100;

        if(!mtr1.isMesin && newKecepatan > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            mtr1.kecepatan = newKecepatan;
        }

        mtr3.displayStatus();
    }
}
