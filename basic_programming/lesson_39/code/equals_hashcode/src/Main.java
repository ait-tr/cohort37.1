public class Main {

    public static void main(String[] args) {
        Order order1 = new Order(2,"order");
        Order order2 = new Order(2,"order");

        System.out.println(order1 == order2);
        System.out.println(order1.equals(order2));
        System.out.println(order1.equals(order1));
        System.out.println(order2.equals(order1));

        /*
        equals() contract
        1. reflexive - обьект должен быть равен самому себе
        2. symmetric - x.equals(y)  должен вернуть тот же результат что и y.equals(x)
        3. transitive - если x.equals(y) и y.equals(z)  то x.equals(z)
        4. consistent - значение equals()  может меняться только если изменяться значения содержащиеся в нем
         */

        String str = "Java";
        System.out.println(str.hashCode());
        String str1 = "Hello";
        System.out.println(str1.hashCode());
        System.out.println(str1.hashCode());
        System.out.println("Order1 hashcode = " + order1.hashCode());
        System.out.println("Order2 hashcode = " + order2.hashCode());

        /*
        HashCode
         хешкод - это целое число, которое генерируется с помощью алгоритма хеширования

         hashCode() contract

         1. При вызове на одном и том же обьекте несколько раз во время выполнения программы hashcode()  должен
            возвращать одно и тоже значение, при условии что значения полей не изменились.
            При этом само значение не обязательно должно оставаться неизменным при нескольких вызовах программы

         2. Если два обьекта равны в соответствии  с equals()  то их хешкоды должны быть одинаковые
         3. Если два обьекта не равны по equals()  то вызов метода hashCode()  не обязательно дает разные результаты
         */
    }
}
