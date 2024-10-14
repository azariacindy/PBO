package assignment6;

public class Appliance {
    public String brand;
    public String model;
    public int powerConsumption;

    // Constructor tanpa parameter
    public Appliance() {
        this.brand = "Unknown Brand";
        this.model = "Unknown Model";
        this.powerConsumption = 0;
    }

    // Constructor berparameter
    public Appliance(String brand, String model, int powerConsumption) {
        this.brand = brand;
        this.model = model;
        this.powerConsumption = powerConsumption;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Power Consumption: " + powerConsumption + " watts");
    }
}
