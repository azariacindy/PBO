public class FrontLoadWashingMachine extends WashingMachine {
    private double drumSize;

    public FrontLoadWashingMachine(String brand, String model, double drumSize) {
        super(brand, model);  // call to the parent class constructor
        this.drumSize = drumSize;
    }

    public void displayFrontLoadInfo() {
        displayInfo();  // call the displayInfo() method from the parent class
        System.out.println("Drum Size: " + drumSize + " liters");
    }
}
