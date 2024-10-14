public class PerkalianKu {
    // method pertama memiliki 2 parameter
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    // method ke-dua memiliki 3 paramter
    void perkalian(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public static void main(String args[]) {
        PerkalianKu objek = new PerkalianKu();
        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }
}
