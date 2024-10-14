public class Handphone06 {
    String brand;
    String model;
    int batteryLevel;
    String operatingSystem;
    int storageCapacity;

    public void turnOn() {
        System.out.println(model + " is now ON.");
        System.out.println("----------------------");
    }

    public void turnOff() {
        System.out.println(model + " is now OFF.");
        System.out.println("----------------------");
    }

    public void unlock() {
        System.out.println(model + " is unlocked.");
        System.out.println("----------------------");
    }

    public void makeCall(String number) {
        System.out.println("Calling " + number + " using " + model);
        System.out.println("----------------------");
    }

    public void sendText(String message, String number) {
        System.out.println("Sending text: \"" + message + "\" to " + number);
        System.out.println("----------------------");
    }

    public void adjustVolume(int level) {
        System.out.println("Volume set to " + level + " on " + model);
        System.out.println("----------------------");
    }
}
