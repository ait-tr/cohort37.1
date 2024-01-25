import java.util.Optional;

public class OurOptional {
    /*
    Класс  Optional  - предоставляет доп. возможности для обработки null


     */
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());

        // создание не пустого  обьекта
        String name = "John";
        Optional<String> optJohn = Optional.of(name);
        System.out.println(optJohn.isPresent());

        optJohn.ifPresent(str -> System.out.println(str.length()));

        // методы получения значения
        String nullName = null;
      //  nullName = "Jack";

        // orElse
        String kate = Optional.ofNullable(nullName).orElse("Kate");
        System.out.println(kate);
        // orElseGet
        String anotherName = Optional.ofNullable(nullName).orElseGet(()->"Kate");

        // get
        Optional<String> word = Optional.of("Java");
        String hello = word.get();


    }
}
