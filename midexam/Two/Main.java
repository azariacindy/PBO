public class Main {
    public static void main(String[] args) {
        // creating objects
        FrontLoadWashingMachine frontLoadMachine = new FrontLoadWashingMachine("LG", "FL123", 7.5);
        SmartWashingMachine smartMachine = new SmartWashingMachine("Samsung", "SM567", true);

        // display info
        System.out.println("Front Load Washing Machine:");
        frontLoadMachine.displayFrontLoadInfo();

        System.out.println("\nSmart Washing Machine:");
        smartMachine.displaySmartInfo();
    }
}
