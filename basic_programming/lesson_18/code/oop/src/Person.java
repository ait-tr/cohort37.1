public class Person {


    public String name;
    public int age;

    public int height;


    public Person(){ //  конструктор это специальный метод, который используется для создания нового
                    // обьекта класса. Название конструктора пишется с большой буквы и совпадает с именем класса.
                    // в обозначении конструктора отсутствует тип возвращаемого значения
        name = "No name";
        age = 0;

    }

    // Конструктров в классе может быть несколько

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String personsName, int personsAge, int personsHeight){
        name = personsName;
        age = personsAge;
        height = personsHeight;
    }

    public void canWalk(){
        System.out.println( name + " can walk");
        System.out.println(name +" is " + age +" years old"  );
    }

    public void myName(){
        System.out.println("My name is " + name);
    }


}
