public abstract class Employee implements Comparable<Employee> {

    private int id;
    private String firstName;
    private String lastName;
    private double hour;


    public Employee(int id, String firstName, String lastName, double hour) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hour = hour;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHour() {
        return hour;
    }


    public abstract double calculateSalary();

    public int compareTo( Employee e){
        return getLastName().compareTo(e.getLastName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hour=" + hour +
                '}';
    }
}
