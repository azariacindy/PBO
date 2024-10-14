public class phone06 {
    public static void main(String[] args) {
        String brand1 = "Apple";
        String model1 = "iPhone 13 Pro Max";
        String year1 = "2023";
        int battery1 = 90;

        String brand2 = "Apple";
        String model2 = "iPhone 12";
        String year2 = "2023";
        int battery2 = 60;

        String brand3 = "Apple";
        String model3 = "iPhone 11";
        String year3 = "2022";
        int battery3 = 75;

        String brand4 = "Samsung";
        String model4 = "Galaxy Z Flip 4";
        String year4 = "2024";
        int battery4 = 55;

        String brand5 = "Samsung";
        String model5 = "Galaxy Z Fold 6";
        String year5 = "2024";
        int battery5 = 90;

        String brand6 = "Apple";
        String model6 = "iPhone 13";
        String year6 = "2023";
        int battery6 = 95;

        String brand7 = "Apple";
        String model7 = "iPhone 12 Pro";
        String year7 = "2023";
        int battery7 = 70;

        String brand8 = "Samsung";
        String model8 = "Galaxy Note 20";
        String year8 = "2023";
        int battery8 = 70;

        String brand9 = "Samsung";
        String model9 = "Galaxy S21";
        String year9 = "2023";
        int battery9 = 85;

        String brand10 = "Apple";
        String model10 = "iPhone 13 Mini";
        String year10 = "2023";
        int battery10 = 100;

        battery1 = useBattery(battery1, 15);
        battery2 = chargeBattery(battery2, 20);
        battery3 = useBattery(battery3, 10);
        battery4 = useBattery(battery4, 5);
        battery5 = chargeBattery(battery5, 10);
        battery6 = chargeBattery(battery9, 12);
        battery7 = useBattery(battery7, 33);
        battery8 = useBattery(battery9, 20);
        battery9 = chargeBattery(battery9, 13);
        battery10 = useBattery(battery10, 5);


        System.out.println("Brand: " + brand1 + ", Model: " + model1 + "Year of: " + year1 + ", Battery: " + battery1 + "%");
        System.out.println("Brand: " + brand2 + ", Model: " + model2 + "Year of: " + year2 + ", Battery: " + battery2 + "%");
        System.out.println("Brand: " + brand3 + ", Model: " + model3 + "Year of: " + year3 + ", Battery: " + battery3 + "%");
        System.out.println("Brand: " + brand4 + ", Model: " + model4 + "Year of: " + year4 + ", Battery: " + battery4 + "%");
        System.out.println("Brand: " + brand5 + ", Model: " + model5 + "Year of: " + year5 + ", Battery: " + battery5 + "%");
        System.out.println("Brand: " + brand6 + ", Model: " + model6 + "Year of: " + year6 + ", Battery: " + battery6 + "%");
        System.out.println("Brand: " + brand7 + ", Model: " + model7 + "Year of: " + year7 + ", Battery: " + battery7 + "%");
        System.out.println("Brand: " + brand8 + ", Model: " + model8 + "Year of: " + year8 + ", Battery: " + battery8 + "%");
        System.out.println("Brand: " + brand9 + ", Model: " + model9 + "Year of: " + year9 + ", Battery: " + battery9 + "%");
        System.out.println("Brand: " + brand10 + ", Model: " + model10 + "Year of: " + year10 + ", Battery: " + battery10 + "%");
    }

    public static int useBattery(int battery, int inc) {
        return battery - inc;
    }

    public static int chargeBattery(int battery, int dec) {
        return battery + dec;
    }
}
