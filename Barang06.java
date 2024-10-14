public class Barang06 {
    public  String kode;
    public String nama;
    public double hargaKotor;
    public double diskon;

    public double getHargaBersih() {
        return hargaKotor - diskon * hargaKotor; // if performing calculations, processing or retrieving data that will be used in other sections
    }

    public void display() {
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama        : " + nama );
        System.out.println("Harga Kotor : " + hargaKotor);
        System.out.println("Diskon      : " + diskon + "%");
        System.out.println("Harga Bersih: " + getHargaBersih());
    }
}
