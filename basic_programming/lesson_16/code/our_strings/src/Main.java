import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     String java = "Java";
     String str1 = new String("Java");

     // 0 1 2 3
     // J a v a
        // строки в Джава являются неизменяемыми (immutable)

        // методы для работы со строками
        //1. метод length() - возвращает длину строки
        java = "Hello";
        System.out.println("String java length is "+ java.length());

        // toCharArray() - преобразует строку в массив символов
        char[] helloArray = java.toCharArray();
        System.out.println(Arrays.toString(helloArray));

        //  пустая строка
        String empty ="";
       // empty =" "; length = 1
        System.out.println("empty length is "+ empty.length());

        //3. isEmpty() - проверяет пустая ли строка
        System.out.println(java.isEmpty());
        System.out.println(empty.isEmpty());

        String str = null;//  строка не указывает на обьект

        String string1 = "Hello";
        String string2 = "Java";
        String result = string1 +" " + string2 +" " + 2023;
        System.out.println(result);

        // concat() -  также используется для обьединения строк
     String resConcat =   string1.concat(" ").concat(string2).concat(" ").concat("2023");
        System.out.println(resConcat);

        // join() -  используется для обьединения строк, при этом первым параметром идет разделитель строк, а дальше через
        // запятую обьединяемые строки
        String strJoin = String.join(":",string1,string2);
        System.out.println(strJoin);

        // извлечение символа - метод charAt(int index)

        String name ="John";

        // 0 1 2 3
        // J o h n
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
      //  System.out.println(name.charAt(4));

      //  name = "Hi";
        System.out.print("Last symbol of the string is ");
        System.out.println(name.charAt(name.length() - 1));

        System.out.println("With for cycle");
        for( int i = 0; i < name.length(); i++ )
            System.out.println(name.charAt(i));

       // for(String s : name) не работает

        // Равенство  строк проверяется через  метод equals(). Сравнивать строки с помощью == не правильно !
        String jack = "Jack";
        String jack1 = "Jack";
        System.out.println(jack == jack1);

        String jack2 = new String("Jack");
        System.out.println("with ==: " + (jack == jack2));
        System.out.println("with equals: " + jack.equals(jack2));

        // равенство строк, игнорируя регистр - EqualsIgnoreCase
        System.out.println("Equals ignore case");
        String kate = "kAtE";
        String kate1 ="Kate";

        System.out.println(kate.equalsIgnoreCase(kate1));

        // toUpperCase() - переводит символы в верхний регистр
        System.out.println("hello".toUpperCase());

        // toLowerCase() - переводит в нижний регистр
        System.out.println("HeLLo".toLowerCase());


        // Сравнение строк
        // int compareTo(String str)
        // int compareToIgnoreCase(String str)

        /*
        Для определения больше или меньше одна строка другой используется лексикографический порядок.

        Результаты сравнения:
        если возвращается число больше ноля, то первая строка больше второй
        если  меньше ноля то первая меньше второй
        если ноль - они равны
         */

        String s1 = "hello";
        String s1H = "Hello";
        String s2 = "world";
        String s3 = "hell";
        String s4 = "wo";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s1H));
        System.out.println(s1.compareToIgnoreCase(s1H));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s4));

        // indexOf() - находит индекс первого вхождения символа/ подстроки в строку, а если такого символа нет он
       // возвращает -1

       String stringHello = "Hello Java";
       int indexL = stringHello.indexOf('l');
       System.out.println("index of first l is " + indexL);
       System.out.println("index of e is " + stringHello.indexOf('e'));
       System.out.println("index of y is " + stringHello.indexOf('y'));

       // lastIndexOf() - индекс последнего вхождения
       System.out.println("last index of l = " + stringHello.lastIndexOf('l'));


       // trim() -  удаляет пробелы по краям строки
       String str2 = "               Hello java!     ";
       System.out.println("begin "+str2+" end");
       System.out.println("begin "+str2.trim()+" end");

       // split - разбивает строку на части ( на подстроки) по определенному разделителю
       String sentence = "Java       is a great programming language";
      String[] words = sentence.split(" ");

       System.out.println(Arrays.toString(words));
      // System.out.println(sentence.split(" "));

       // substring() -  с помощью этого метода можно получить часть строки
       // substring(int beginIndex)
       String partOfGeorge = "George".substring(2);
       System.out.println("George substring is " + partOfGeorge);

       // substring(int beginIndex, int endIndex) - beginIndex - входит в подстроку, индекс конца не входит.

       String part1 = "George".substring(2,5);
       System.out.println("George substring 2 is " + part1);

       String substr1 = "Hello".substring(0);
       System.out.println(substr1);

     //  System.out.println("Hello".substring(1,25));
       System.out.println("Hello".substring(0,"Hello".length()-1));


    }
     /*
        Дана строка четной длины. Написать метод, возвращающий первую половину этой строки
        Hell -> He
        George -> Geo
        */
   public static String findHalfString( String str){
      return str.substring(0,str.length()/2);
   }

}
