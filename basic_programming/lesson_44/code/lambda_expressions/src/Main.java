import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    /*
    Лямбда - выражения
    Lambda - expresiions

    Лямбда выражения используются для реализации метода функционального интерфейса.
    Функциональным называется интерфейс, имеющий только один абстрактный метод

    (argument-list) -> {body}
    () -> {body}
    (par) -> {body}
    (par1,par2) -> {body}
     */
    public static void main(String[] args) {

        int height = 100;

        // реализация через анонимный класс
        Flyable flyable = new Flyable(){
            public void fly(){
                System.out.println("Flying at " + height);
            }
        };
        flyable.fly();


        // через лямбда-выражение

        Flyable fLambda = () -> {
            System.out.println("Flying with lambda at " + height);
        };
        fLambda.fly();

        Flyable fLambda1 = () ->{
            System.out.println("This is completely different implementation " + height);
        };
        fLambda1.fly();

        Walkable w = () -> {
            return "I can walk";
        };

        System.out.println(w.walk());

        Eatable eatable = (food) ->{
            return "A man eats " + food;
        };
        System.out.println(eatable.eat("orange"));

        Arithmetical arithmetical = (x,y) -> {
            return x + y;
        };

        System.out.println(arithmetical.calculate(1,2));

        // короткая форма записи - lambda-expression

        Arithmetical arithmetical1 = (x,y) -> x + y;
        System.out.println(arithmetical1.calculate(2,3));

        Arithmetical minus = (x,y) -> x - y;
        System.out.println( minus.calculate(4,3));

        Eatable eatableShort = f -> "A man eats " + f;

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Ann");
        names.add("Jack");
        names.add("Bill");

        names.forEach(
                n -> System.out.println(n)
        );

        List<Product> items = new ArrayList<>();
        items.add( new Product("keybord",2500));
        items.add( new Product("tvset",500));
        items.add( new Product("laptop",300));

        Collections.sort(items, (p1,p2)->p1.name.compareTo(p2.name));
        System.out.println(items);

        System.out.println("price");
        Collections.sort(items,(p1,p2)->p1.price - p2.price);
        System.out.println(items);

    }
}
