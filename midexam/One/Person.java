public class Person {
    String name;
    String phoneNumber;
    String emailAddress;
    Address address;

    public Person(String name, String phoneNumber, String emailAddress, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }


    public void purchaseParkingPass() {
        System.out.println(name + " is purchasing a parking pass.");
    }
    
    public void displayPersonDetails() {
        System.out.println("Name           : " + name);
        System.out.println("Phone Number   : " + phoneNumber);
        System.out.println("Email          : " + emailAddress);
        System.out.println("Address        : " + address.outputAsLabel());
    }
}
