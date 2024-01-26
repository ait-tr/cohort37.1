import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //flatMap
        String[] strings = {"Hello","Java"};

        Arrays.stream(strings)
                .map(str -> str.split(""))
                .map(Arrays :: stream)
                .forEach(System.out :: println);


        Arrays.stream(strings)
                .map(str -> str.split(""))
                .flatMap(Arrays :: stream)
                .forEach(System.out :: print);

        // терминальные операторы
        /*
        count() -  возвращает кол-во элементов в потоке

        findFirst()/findAny() -  извлекает первый эл-т / случайный элт ( часто тоже первый)

         */
        System.out.println();
        List<String> list = Arrays.asList("one","two","three","four");

      Optional<String> first = list.stream().findFirst();
        System.out.println(first.get());

        Optional<String> any = list.stream().findAny();
        System.out.println(any.get());

        // allMatch, anyMatch, noneMatch

        /*
        allMatch(predicate) - true , если все элементы стрима удовлетворяют условию предикаты
        anyMatch(predicate) - true , если хотя бы один элемент стрима удовлетворяет условию предикаты
        noneMatch(predicate) - true , если ни один элемент стрима не удовлетворяет условию предикаты
         */
        List<String> names = Arrays.asList("Jack","John","Ann","Vladislav");

        boolean allElements = names.stream().allMatch(s -> s.length() > 2);
        System.out.println(allElements);

        boolean anyElement = names.stream().anyMatch(s -> s.length() > 7);
        System.out.println(anyElement);

        boolean noneElement = names.stream().noneMatch(s -> s.equals("Tim"));
        noneElement = names.stream().noneMatch(s -> s.equals("Ann"));
        System.out.println(noneElement);

        // min()  и max() -  возвращают мин и макс значение
        // Optional<T> min ( T comparator)

        List<Integer> ints = Arrays.asList(3,4,1,34,68,19);

       Optional<Integer> minElt =  ints.stream().min(Integer:: compare);
        System.out.println(minElt.get());

        Optional<Integer> maxElt =  ints.stream().max(Integer:: compare);
        System.out.println(maxElt.get());

        // reduce()

      Optional<Integer> res =  Stream.of(1,2,3,4,5).reduce((a,b)-> a * b);
        System.out.println(res.get());
        // e1*e2*e3*e4*e5

      Optional<String> stringResult = Stream.of("Hello","Java","!!")
              .reduce((str1,str2)-> str1 +" " +str2);
        System.out.println(stringResult.get());

      int result = Stream.of(1,2,3,4,5).reduce(2,(a,b)->a * b);
        System.out.println(result);

        //метод collect(collector)
        // Collector<T,A,R> collector
        /*
         несколько методов класса Collectors:
        toList()
        toSet()
        toMap()
         */

        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Opel");
        cars.add("Ford");
        cars.add("Ford");

        List<String> carsFiltered =cars.stream()
                .filter(car -> car.length() > 3)
                .collect(Collectors.toList());

        System.out.println(carsFiltered);


        Set<String> carsSet =cars.stream()
                .filter(car -> car.length() > 3)
                .collect(Collectors.toSet());

        System.out.println(carsSet);

        Car car1 = new Car("BMW",150000);
        Car car2 = new Car("Mercedes",200000);
        Car car3 = new Car("Opel",40000);

        List<Car> carList = Arrays.asList(car1,car2,car3);

        Map<String,Integer> carMap = carList.stream()
                .collect(Collectors.toMap(Car::getBrand,Car::getPrice));

        System.out.println(carMap);
        carMap.forEach((key,value) -> System.out.println("key: " + key + " ,value:" + value));

        ArrayList<Car> resultCars = carList.stream().collect(Collectors.toCollection(ArrayList :: new));

        System.out.println("grouping by");
        List<String> namesList = Arrays.asList("John","Bill","Tim","Jack","Peter","Benji");
        System.out.println(namesByLength(namesList));

        System.out.println("\npartitioning by");
        System.out.println(partitioningList(namesList));

        System.out.println("\njoining");
        System.out.println(convertToString(namesList));
    }
    // groupingBy collector -  используется для группировки обьектов по заданному признаку и сохранения
    // результата в мапе :
    // Написать метод, группирующий элементы листа строк по длине строки и сохраняющий рез-т в сетах. Метод вернет
    // мапу

    public static Map<Integer,Set<String>> namesByLength( List<String>list){
        return list.stream()
                .collect(Collectors.groupingBy(String :: length, Collectors.toSet()));
    }

    /*
    partitioningBy - особый случай groupingBy , принимающий предикату и собирающий стрим в мапу, у которой
    ключами будут true false, а в качестве значений  - коллекции элементов.
    Ключ true -  элементы, удовлетворяющие условию
    false -  не удовл.
    Пример: написать метод, разделяющий элементы листа стрингов по длине строки  > 4  и возвращающий мапу
    с ключами true false и листами соответствующих элементов

     */
    public static Map<Boolean,List<String>> partitioningList( List<String>strings){
        return strings.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 4));
    }

    /*
    joining()
    обьединить имена из листа в строку такого вида Students: name1,name2,name3 study Java

     */
    public static String convertToString( List<String>strings){
        return strings
                .stream()
                .collect(Collectors.joining(", ","Students: "," study Java"));
    }

}
