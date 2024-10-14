package jobsheet3;

public class MotorEnMain06 {
    public static void main(String[] args) {
        MotorEn06 mtr1 = new MotorEn06();
        mtr1.displayStatus();

        // use setter to set platNomor
        mtr1.setPlatNomor("R 0000 CS");
        mtr1.setKecepatan(50);
        mtr1.displayStatus();

        MotorEn06 mtr2 = new MotorEn06();
        mtr2.setPlatNomor("R 0010 CS");
        mtr2.setIsMesinOn(true);
        mtr2.setKecepatan(40);
        mtr2.displayStatus();

        MotorEn06 mtr3 = new MotorEn06();
        mtr3.setPlatNomor("X 0900 DS");
        mtr3.setKecepatan(-10);
        mtr3.displayStatus();
    }
}
