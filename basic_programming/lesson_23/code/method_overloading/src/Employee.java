public class Employee {
    public String name;
    public  int salary;
    public String address;


    public Employee(){
        // вызов конструтора с параметром String
        this("John");
    }


    public Employee(String name){
        // вызов конструктора с параметрами String и int
        this(name, 5000);
    }

    public Employee(String name, int salary){

        //  вызов конструктора с парам String, int, String
        this( name, salary, "Street1" );
    }


    public Employee( String name, int salary, String address){
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public void displayEmployee(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
    }
}
