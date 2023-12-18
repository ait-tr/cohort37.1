public class Teacher {

    String teacherName;
    int telNumber;
    Address address;

    public Teacher(String teacherName, int telNumber, Address address) {
        this.teacherName = teacherName;
        this.telNumber = telNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                ", telNumber=" + telNumber +
                ", address=" + address +
                '}';
    }
}
