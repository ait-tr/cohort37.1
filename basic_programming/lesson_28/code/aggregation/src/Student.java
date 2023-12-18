public class Student {
    String name;
    int telNumber;

    // создаем отношение HAS-A c классом Address
    Address address;

    public Student( String name, int telNumber, Address address){
        this. name = name;
        this.telNumber = telNumber;
        this.address = address;
    }
    public void printAddress(){
        System.out.println(address.city);
        System.out.println(address.houseNumber);
        System.out.println(address.street);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", telNumber=" + telNumber +
                ", address=" + address +
                '}';
    }
}
