public class School {

    String name;
    Address address;

    public School(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
