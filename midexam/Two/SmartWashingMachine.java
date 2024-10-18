public class SmartWashingMachine extends WashingMachine {
    private boolean wifiEnable;

    public SmartWashingMachine(String brand, String model, boolean wifiEnable) {
        super(brand, model);
        this.wifiEnable = wifiEnable;
    }

    public void displaySmartInfo() {
        displayInfo();
        System.out.println("Wi-Fi Enabled: " + (wifiEnable ? "Yes" : "No"));
    }
}
