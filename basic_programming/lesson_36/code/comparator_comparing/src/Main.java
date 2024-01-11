import java.util.Arrays;
import java.util.Comparator;

public class Main {
    //  метод thenComparing - позволяет использовать цепочку компараторов

    public static void main(String[] args) {
        Person person1 = new Person("Jack", 33);
        Person person2 = new Person("Nick", 35);
        Person person3 = new Person("Jack", 5);
        Person person4 = new Person("Bill", 135);

        Person[] persons = {person1,person2,person3,person4};

        Comparator<Person> combinedComparator =
                new PersonNameComparator().thenComparing(new PersonAgeComparator());

        Arrays.sort(persons,combinedComparator);
        for( Person person : persons){
            System.out.println(person.getName() + " " + person.getAge());
        }
    }


}
