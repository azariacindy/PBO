package assignment6;

public class Refrigerator extends Appliance {
    public int storageVolume;

    // Constructor tanpa parameter
    public Refrigerator() {
        super(); // Memanggil constructor tanpa parameter dari Appliance
        this.storageVolume = 0;
    }

    // Constructor berparameter
    public Refrigerator(String brand, String model, int powerConsumption, int storageVolume) {
        super(brand, model, powerConsumption); // Memanggil constructor berparameter dari Appliance
        this.storageVolume = storageVolume;
    }

    public void displayRefrigeratorInfo() {
        displayInfo();
        System.out.println("Storage Volume: " + storageVolume + " liters");
    }   
}
