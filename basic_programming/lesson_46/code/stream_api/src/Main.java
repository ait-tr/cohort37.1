import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int[] ints = {10,20,30,40,50,60,70,80};
        int counter = 0;

        for( int i : ints){
            if( i < 31)
                continue;
            i = i * 2;
            counter++;
            if(counter > 4)
                break;
            System.out.println(i);
        }

        System.out.println("with stream");

        IntStream.of(10,20,30,40,50,60,70,80)
                .filter(i -> i >= 31)
                .map(i -> i*2)
                .limit(4)
                .forEach(System.out :: println);

        /*
        Stream API - это поток данных.
        Операторы в стримах бывают :
        промежуточные - после обработки данных они вернут стрим. Промежуточных операторов может быть несколько

        терминальные - после обработки элементов  завершают работу стрима. Терминальный  оператор может быть только один
        Обработка данных не начнется пока не будет вызван терминальный оператор

        Создание стримов:


         */
        Stream<String> empty = Stream.empty(); // пустой стрим

        Collection<String> collection = Arrays.asList("John","Jack","Bill"); // стрим коллекции
        collection.stream();

        String[] arr = {"John","Jack","Bill"};
        Arrays.stream(arr); // стрим массива

        "abcd".chars(); //  стрим строки
         String one = "one";
        Stream.of(one,"two"); //  с помощью статического метода of

        //  стримы примитивов
        IntStream intStream = IntStream.of(1,2,3);
        IntStream.range(1,3); // стрим целых чисел  в диапазоне от 1 до 3, 3 не включая
        IntStream.rangeClosed(1,3); // стрим целых чисел  в диапазоне от 1 до 3, 3  включая

        // стрим примитивов с помощью класса Random
        Random random = new Random();
        random.doubles();

        // метод ForEach  -перебор элементов, терминальный оператор
        Stream<String> names = Stream.of("Jack","John","Ann","Kate");
        names.forEach(System.out :: println);

        // промежуточные операторы
         /*
         filter() -  принимает условие( предикату)  и возвращает поток из элементов, удовлетворяющих этому условию

          */
        System.out.println("after filter");
        names = Stream.of("Jack","John","Ann","Kate");
        names.filter(n ->n.length() == 4).forEach(System.out::println);

        Stream<Car> carStream = Stream.of( new Car("Ford",50000),
                                                  new Car("Mercedes",100000),
                                                  new Car ("Bentley",500000));

        carStream.filter(car -> car.getPrice() < 150000)
                 .forEach(car -> System.out.println(car.getBrand()));


        // map() - маппинг, отображение - преобразует элементы потока map(Function mapper)

        carStream = Stream.of( new Car("Ford",50000),
                new Car("Mercedes",100000),
                new Car ("Bentley",500000));

        carStream.filter(car -> car.getPrice() < 150000)
                .map(Car::getBrand)
                .forEach(System.out :: println);

        carStream = Stream.of( new Car("Ford",50000),
                new Car("Mercedes",100000),
                new Car ("Bentley",500000));

        carStream.map(car ->"brand: " + car.getBrand() + "price: " + car.getPrice())
                 .forEach(System.out::println);

        // sorted() - сортировка
        System.out.println("sorting");

        List<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Volvo");
        cars.add("Volvo");
        cars.add("Bentley");
        cars.add("Bentley");
        cars.add("Opel");
        cars.add("Opel");

        cars.stream()
                .filter(car -> car.length() > 4)
                .sorted()
                .forEach(System.out::println);


        System.out.println();
        // distinct() -  возвращает уникальные элементы
         cars.stream().distinct().forEach(System.out::println);

         // skip(long n) -  пропускает первые n  элементов
        // limit( long n) - возвращает поток в котором не более n первых элементов
        System.out.println("skip and limit");
        List<String> stringList = Arrays.asList("one","two","three","four","five");
        stringList.stream()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        // Терминальные операторы . Операции, возвращающие результат

        //count() - возвращает количество элементов в потоке
        System.out.println(
                stringList.stream()
                .filter(s -> s.length()>3)
                .count()
        );








    }
}
