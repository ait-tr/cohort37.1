import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ООП - обьектно-ориентированное программирование
        /*
        Любой обьект имеет две основные характеристики -1. состояние( данные, которые он хранит)(переменные)
        2. поведение - действия, которые он может совершать (методы)
         */

       // Scanner scanner = new Scanner(System.in);

        Car volvo = new Car();

        Person person1 = new Person();// создание обьекта класса Person
        person1.name = "John";
        person1.age = 30;

      //  System.out.println("Person's 1 name is " + person1.name);
      //  System.out.println(person1.name +"'s age is " + person1.age);
        person1.myName();
        person1.canWalk();


        Person person2 = new Person();
        person2.name = "Kate";
        person2.age = 20;


      //  System.out.println("Person's 2 name is " + person2.name);
      //  System.out.println(person2.name +"'s age is " + person2.age);
        person2.myName();
        person2.canWalk();

        System.out.println();
        // Конструкторы в Джава
        Person person3 = new Person("Jack",60);
        person3.myName();
        person3.canWalk();

        System.out.println();

        Person person4 = new Person();
        person4.myName();
        person4.canWalk();

        System.out.println();

        Person person5 = new Person("Bill",45,180);
        person5.myName();
        person5.canWalk();
        System.out.println(person5.name +"'s height is " + person5.height);
    }
}
