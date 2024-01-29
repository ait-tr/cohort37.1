import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Homework {

    /*
    Задача 1
Пусть есть класс Person с полями имя и возраст. Написать метод,
принимающий список Person и возвращающий мапу,
где возраст является ключом, а лист людей этого возраста значением
     */
    public static void main(String[] args) {
        Person person1 = new Person("Jack",16);
        Person person2 = new Person("Bill",50);
        Person person3 = new Person("Ann",16);
        Person person4 = new Person("Mary",50);
        Person person5 = new Person("Peter",30);
        List<Person> persons = Arrays.asList(person1,person2,person3,person4,person5);

        System.out.println(getPersonsByAge(persons));

        getPersonsByAge(persons).forEach((k,v) -> System.out.println(k + "->" +
                                            v.stream().map(Person::getName).toList()));


        System.out.println("Total age of persons older than 18 is " + countTotalAge(persons));
        System.out.println(printLegalAgeNames(persons));

        System.out.println(countWords("aaaaaaa cccc ab bbbbb a ff aaa","a"));
        System.out.println(countWords("aaaaaaa cccc ab bbbbb a ff aaa","aaa"));
        System.out.println(countWords("aaaaaaa cccc ab bbbbb a ff aaa","aaaaa"));
    }

    public static Map<Integer, List<Person>> getPersonsByAge(List<Person>persons){
        return persons
                .stream()
                .collect(Collectors.groupingBy(Person :: getAge));


    }

    /*
    Задача 2
Есть тот же класс Person с полями String name, int age.

Написать метод,принимающий список Person и возвращающий суммарный возраст тех, кто старше 18 лет
Написать метод,принимающий список Person и возвращающий имена тех, кто старше 18 лет в виде такой строки:
"At the moment John and Ann and Bill are of legal age "
( имена и текст могут быть любыми, по вашему выбору, структура предложения должна сохраняться)
     */

    public static int countTotalAge( List<Person> persons){
        return persons
                .stream()
                .filter(p -> p.getAge() > 18)
                .map(Person::getAge)
                .reduce(0,Integer :: sum);
    }


    public static int countTotalAge2( List<Person> persons){
        return persons
                .stream()
                .filter(p -> p.getAge() > 18)
                .mapToInt(Person::getAge)
                .sum();
    }

    public static String printLegalAgeNames( List<Person> persons){
        return persons
                .stream()
                .filter(p -> p.getAge() > 18)
                .map(Person :: getName)
                .collect(Collectors.joining(" and "," At the moment "," are of legal age."));
    }

    /*
    Задача 3
Написать метод, принимающий в качестве параметров две строки.
Первая строка состоит из слов, разделенных пробелом.
Метод возвращает количество слов первой строки, начинающихся со второй строки
Пример : Первая строка "aaaaaaa cccc ab bbbbb a ff aaa"
Если вторая строка а, то ответ 4
Если вторая строка ааа, ответ 2
Если вторая строка aaaa, ответ 1
     */

    public static long countWords(String sentence, String pattern){
        return Stream.of(sentence.split(" "))
                .filter(w ->w.startsWith(pattern))
                .count();
    }




}
