import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class Homework {
    //Написать метод, принимающий лист имен, в котором некоторые имена повторяются
    // и печатающий имена из листа без печати повторений.
    // При решении использовать Stream API
    public static void main(String[] args) {
        List<String> list = List.of("John","John","Jack","Jack");
        withoutDuplicates(list);

        Address address1 = new Address("Street1",1);
        Address address2 = new Address("Street2",2);
        Address address3 = new Address("Street3",3);
        Address address4 = new Address("Street4",4);

        Person person1 = new Person("Person1",16,address1);
        Person person2 = new Person("Person2",26,address2);
        Person person3 = new Person("Person3",10,address3);
        Person person4 = new Person("Person4",116,address4);

        List<Person>persons = List.of(person1,person2,person3,person4);
        addressesPersonsMore17(persons);
    }

    public static void withoutDuplicates(List<String> names){
        names.stream().distinct().forEach(System.out :: println);
    }

    public static List<String> withoutDuplicatesList(List<String> names){
        return names.stream().distinct().collect(Collectors.toList());
    }

    public static List<String> withoutDuplicatesSet(List<String> names){
        return names.stream().collect(
                Collectors.collectingAndThen(toSet(), ArrayList ::new));
    }



    /*
    Есть класс Address с полями String street и int houseNumber и
    класс Person с полями String name, int age, Address address.
    Используя Stream API написать метод, принимающий лист Person и печатающий адреса тех, кто старше 17 лет
     */

    public static void addressesPersonsMore17( List<Person> personList){
        personList.stream()
                .filter(p -> p.getAge() > 17)
                .map(Person::getAddress)
                .forEach(System.out :: println);

    }

    public static List<Address> addressesPersonsMore17List( List<Person> personList){
        return  personList.stream()
                .filter(p -> p.getAge() > 17)
                .map(Person::getAddress)
               // .forEach(System.out :: println);
                .collect(Collectors.toList());

    }
}
