public class WashingMachine {
    protected String brand;
    protected String model;

    public WashingMachine(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
