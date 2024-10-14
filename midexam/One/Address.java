public class Address {
    String street;
    String city;
    String state;
    String postalCode;
    String country;

    public Address(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String outputAsLabel() {
        return street + ", " + city + ", " + state + ", " + postalCode + ", " + country;
    }
}
