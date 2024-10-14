public class PerkalianKuu {
    // memiliki 2 parameter dengan tipe int
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    // memiliki 2 parameter dengan tipe double
    void perkalian(double a, double b) {
        System.out.println(a * b);
    }

    public static void main(String args[]) {
        PerkalianKuu objek = new PerkalianKuu();
        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }
}
