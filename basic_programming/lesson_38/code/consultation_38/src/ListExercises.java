import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExercises {

    /*
    Пусть есть 2 класса: Adrress  с полями улица и номер дома и Person c полями имя и Address.
    Нужно написать метод, который по списку Persons  возвращает список их адресов

    List<Address> getAddresses(List<Persons> persons)

    IS A
     */
    public static void main(String[] args) {

        Address address1 = new Address( "Street1",1);
        Address address2 = new Address( "Street2",2);

        Person person1 = new Person("Person1", address1);
        Person person2 = new Person("Person2", address2);

      /*  List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);

       */
        List<Person>persons = Arrays.asList(person1,person2);
        List<Person>personList = List.of(person1,person2);

        ListExercises listExercises = new ListExercises();

       List<Address> resultToPrint = listExercises.getAddresses(persons);

       for( Address address : resultToPrint){
           System.out.println(address);
       }



    }

    public List<Address> getAddresses(List<Person> persons){
        List<Address> returnAddress = new LinkedList<>();

        for(Person p : persons)
            returnAddress.add(p.getAddress());

        return returnAddress;
    }

    public static void staticMethod(){
        System.out.println("I am static");
    }
}
