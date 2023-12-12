public class ParentClass {

    String name;
    int age;
    ParentClass(String name){
        this.name = name;
        System.out.println("I am Parent Class Constructor " );
    }
    ParentClass(String name, int age){
        this.name = name;
        this.age = age;
    }
}
