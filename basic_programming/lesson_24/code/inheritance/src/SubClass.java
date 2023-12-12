public class SubClass extends ParentClass{
   String name;
    public SubClass(String name){
        super(name);
        // super(name);
        System.out.println("I am Constructor of the SubClass " + name);
    }

    public SubClass(String name, int age){
        super(name,age);
        // super(name);
        System.out.println("I am Constructor of the SubClass " + name +" , my age is " + age);
    }




}
