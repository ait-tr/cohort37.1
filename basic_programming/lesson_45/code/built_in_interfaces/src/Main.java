import java.util.function.*;

public class Main {
    /*
    Встроенные функциональные интерфейсы:

    Predicate<T> -  проверяет соблюдение некоторого условия. Если оно соблюдается,
    возвращает true
        boolean test(T t)
     */
    public static void main(String[] args) {
        Predicate<Integer> isNegative = a -> a < 0;
        System.out.println(isNegative.test(3));
        System.out.println(isNegative.test(-3));

        // BinaryOperator<T> принимает два обьекта типа T  что-то с ними делает и возвращает рез-т типа T
        // T apply( T o1, T o2)
        BinaryOperator<Integer> plus = (a,b) -> a +b;
        System.out.println(plus.apply(1,2));

        BiFunction<Integer,Integer,String> concate = (a,b) -> Integer.toString(a) + b;
        System.out.println(concate.apply(1,2));

        //UnaryOperator<T>  принимает обьект типа T  , совершает с ним какие-то действия и возвращает  в виде
        // обьекта того же типа  T apply(T o1)

        UnaryOperator<Integer> square = a -> a*a;
        System.out.println(square.apply(2));

        // Function<T,R> -  принимает тип T,  возвращает R
        Function<Integer,String> modify = i -> String.valueOf(i) +" years";
        System.out.println(modify.apply(50));

        /*
        Consumer<T>
        void accept( T o)
         */
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");

        /*
        Supplier<T> -  ничего не принимает, но возвращает обьект типа Т
        T get()
         */
        Supplier<String> supplier = () -> " Hello !!!";
        System.out.println(supplier.get());

    }
}
