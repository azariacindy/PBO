public class Vehicle {
    private String licensePlate;
    private String type; 
    
    // constructor
    public Vehicle(String licensePlate, String type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    // getters
    public String getLicensePlate() {
        return licensePlate;
    }

    public String getType() {
        return type;
    }

    // method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Type  : " + type);
        System.out.println("License Plate : " + licensePlate);
    }
}
