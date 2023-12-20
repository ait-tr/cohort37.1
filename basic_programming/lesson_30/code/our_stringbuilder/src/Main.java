public class Main {

    // StringBuilder class - с помощью этого класса можно создавать изменяемые строки
    public static void main(String[] args) {
        String a = "hello";
        a = "Java";

        /*
        Некоторые котнструкторы:
        StringBuilder() - базовый конструктор, создает пустой стрингбилдер с начальным размером 16
        StringBuilder( String str) - создает стрингбилдер из строки str
        StringBuilder(32)
         */

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(sb2);

        //  методы StringBuilder
        // append() - присоединяет строку к уже существующей
        sb2.append(" Java");
        System.out.println(sb2);
        sb2.append(" !").append(12345);
        System.out.println(sb2);

        System.out.println(sb2.reverse());

        sb2.insert(1,"AAA");
        System.out.println(sb2);
    }
}
