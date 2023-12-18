public class Address {
    String street;
    int houseNumber;
    String city;

    public Address ( String street, int houseNumber, String city){
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", city='" + city + '\'' +
                '}';
    }
}
