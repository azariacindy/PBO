public class HandphoneMain06 {
    public static void main(String[] args) {
        // instansiasi objek hp1
        Handphone06 hp1 = new Handphone06();
        hp1.brand = "Apple";
        hp1.model = "iPhone 16";
        hp1.batteryLevel = 85;
        hp1.operatingSystem = "iOS";
        hp1.storageCapacity = 512;

        // using method for hp1
        hp1.turnOn();
        hp1.unlock();
        hp1.makeCall("1234567890");
        hp1.sendText("Hello!", "1234567890");
        hp1.adjustVolume(70);
        hp1.turnOff();
        System.out.println("----------------------");

        // instansiasi objek hp2
        Handphone06 hp2 = new Handphone06();
        hp2.brand = "Samsung";
        hp2.model = "Galaxy S24 Ultra";
        hp2.batteryLevel = 75;
        hp2.operatingSystem = "Android";
        hp2.storageCapacity = 256;

        // using method for hp2
        hp2.turnOn();
        hp2.unlock();
        hp2.makeCall("0987654321");
        hp2.sendText("Good Morning!", "0987654321");
        hp2.adjustVolume(80);
        hp2.turnOff();
        System.out.println("----------------------");
    }
}
