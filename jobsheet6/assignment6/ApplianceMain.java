package assignment6;

public class ApplianceMain {
    public static void main(String[] args) {
        // Instansiasi objek dari WashingMachine dengan constructor berparameter
        WashingMachine wm = new WashingMachine("Samsung", "WM123", 1500, 7);
        wm.displayWashingMachineInfo();
        System.out.println();

        // Instansiasi objek dari Refrigerator dengan constructor berparameter
        Refrigerator fridge = new Refrigerator("LG", "GR-D32", 200, 300);
        fridge.displayRefrigeratorInfo();
        System.out.println();

        // Modifikasi nilai atribut
        wm.loadCapacity = 8; // Mengubah nilai loadCapacity
        fridge.storageVolume = 350; // Mengubah nilai storageVolume

        System.out.println("After modification:");
        wm.displayWashingMachineInfo();
        System.out.println();
        fridge.displayRefrigeratorInfo();
    }
}
