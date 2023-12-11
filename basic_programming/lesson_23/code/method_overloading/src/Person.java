public class Person {
    String name;
    int age;
    int height;
    int weight;

    public Person(){
        System.out.println("This is a no arqs constructor");
    }

    public Person(String name, int age){
        this();
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int height){
        this(name,age);  // вызов конструктора с двумя параметрами. Должен быть первой строкой в теле конструктора
       // this.name = name;
       // this.age = age;
        this.height = height;
      //  this(name,age);
    }

    public Person(String name, int age, int height, int weight){
        this(name,age,height);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
