public class Main {
    int a;
    /*
    jhvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
    jhbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
    kjnkkkkkkkkkkkkkkkkk

     */
    //  однострочный комментарий

    public static void main(String[] args) {  // метод, с которого начинается выполнение программы
                    // kjbljbljbljbjo
   //     System.out.println("Hello world!");

   //     System.out.print("My name");
   //     System.out.println(" is Evgeny");
   //     System.out.print(" I live in Berlin");

        /*
        Variables  Переменные в Джава

        Каждая перменная в Джава имеет тип, имя и значение

         */
        int number; //  переменная целого типа с именем с именем number
        String word; // переменная типа строка

         //присвоение значения переменной
        // имя = значение;
        number = 1;
        word = "Hello World";
        number = 3;
        System.out.println(number);

        /*
        Правила при написании имен переменных:

        1. по возможности названия переменных должны быть смысловыми
        2. названия переменных не могут содержать пробелы
        3. названия переменных не могут начинаться с числа или содержать ряд специальных символов ( @, #, % &)
        4. принято начинать названия переменных с маленькой буквы.
            Если название состоит из нескольких слов - используется как правило "camel case".
        5. имена переменных  чувствительны к регистру - name и  Name   две разные переменные
        6. В назаваниях переменных не должны использоваться зарезервированные  слова
         */
        int my_name; // snake case
        int myNameJohn; // camel case
       // int int;

        int x;
        int y = 15;
        x = 10;
        x = x + 1 +y;
        y = x;
        System.out.println(x);
        System.out.println(y);
        // ==

        int x1,y1,z1;
        x1 = y1 = z1 = 20;

        System.out.println("50");
        int fifty = - 50;
        //int fiftyString = "50";

        System.out.print(fifty + "1");
        System.out.println("number: " + 2);
        System.out.println(2 + 4);
        System.out.println("2b" + "4");
        System.out.println("2" + 4 + 5);
        System.out.println("2" + (4 + 5));
        System.out.println(2 + 3 +"4");
        System.out.println("My number = " + -50);
        System.out.println("Sum of 1 and 2 = " + (1 + 2));

        x = x +10;
        x += 10;

        String myName = "Evgeny";
        String place = "Berlin";
        myName ="John";
        place = "London";
        System.out.println(myName +" lives in " + place);


        /*
        00000000
        001
        10
        11

        decimal  binary
        0        0000
        1        0001
        2        0010
        3        0011
        4        0100
        5        0101
        6        0110
        7        0111
        8        1000


        Типы данных.
        В Джаве есть 8 т.н. примитивных типов данных. Это
        int, byte,short,long, float,double, char, boolean

        int

         */
        int num = 2_000_000_000;

        // byte ( -128 to 127)
        byte small = 127;

        //short
        short small1 = 20000;


    }


}


