public class Main {
    /*
    Создать следующие интерфейсы:
Printable, содержащий метод void print(String s)
Producable, содержащий метод String produce()
Используя эти интерфейсы написать 2 лямбды, реализующие метод соответствующего интерфейса таким образом:

строка распечатывается в виде !строка!
возвращается строка "Hello World"
     */
    public static void main(String[] args) {

        //  используя наши интерфейсы написать такие лямбды:
        // 1. конкатинировать  a и b   и получить ab
        // 2.  если длина строки 3 вернуть true
        // 3.  если длина строки четная вернуть true  иначе false
        // 4. вернуть строку в верхнем регистре
        // 5. если длина строки 4 вернуть 4 звездочки иначе вернуть строку без изменений

        Concatable concatable = (a,b) -> Integer.toString(a) + b;
        System.out.println(concatable.concat(1,3));

        Checkable checkable = s -> s.length() == 3;
        System.out.println(checkable.check("abc"));
        System.out.println(checkable.check("abcd"));

        System.out.println("checkable even");
        checkable = s -> s.length() % 2 == 0;
        System.out.println(checkable.check("abc"));
        System.out.println(checkable.check("abcd"));

        Transformable transformable = String::toUpperCase;
        System.out.println(transformable.modify("abcDe"));

        Transformable transformable1 = s -> s.length() == 4 ? "****":s;
        System.out.println(transformable1.modify("ab"));
        System.out.println(transformable1.modify("abcd"));

        Printable printable = s -> System.out.println("!" + s + "!");
        printable.print("Hello");

        Producable producable = () -> "Hello World";
        System.out.println(producable.produce());

    }
}
