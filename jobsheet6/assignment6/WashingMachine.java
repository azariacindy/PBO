package assignment6;

public class WashingMachine extends Appliance {
    public int loadCapacity;

    // Constructor tanpa parameter
    public WashingMachine() {
        super(); // Memanggil constructor tanpa parameter dari Appliance
        this.loadCapacity = 0;
    }

    // Constructor berparameter
    public WashingMachine(String brand, String model, int powerConsumption, int loadCapacity) {
        super(brand, model, powerConsumption); // Memanggil constructor berparameter dari Appliance
        this.loadCapacity = loadCapacity;
    }

    public void displayWashingMachineInfo() {
        displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " kg");
    }
}
