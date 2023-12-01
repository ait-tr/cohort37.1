public class Homework {
    public static void main(String[] args) {
        System.out.println(findDoubleLength("Hello"));
        System.out.println(findDoubleLength("Java"));
        System.out.println(concatStrings("Hello","There"));
        System.out.println(firstToEnd("abcd"));

    }

    /*
    Задача 1
Написать метод, принимающий строку и возвращающий целое число, равное двойной длине строки
Пример: Hello -> 10
     */
    public static int findDoubleLength( String str){
        return 2*str.length();
    }

  /*  Задача 2
    Написать метод, принимающий две строки и возвращающий эти строки, соединенные вместе, но без первых букв и в верхнем регистре.
    Пример: "Hello", "There" -> ELLOHERE

   */

    public static String concatStrings(String str1, String str2){
        String result = str1.substring(1) + str2.substring(1);
        return result.toUpperCase();
    }

    /*
    Задача 3*
Написать метод, принимающий строку и возвращающий эту строку с переставленной в конец строки первой буквой.
Примет: abcd -> bcda
     */

    public static String firstToEnd( String str){
        String str1 = str.substring(1);
       // String str2 = str.substring(0,1);
        char str2 = str.charAt(0);

        return str1 + str2;

    }


}
