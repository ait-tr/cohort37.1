import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //  System.out.println("Enter number");
       // int number = scanner.nextInt();

       int  number = 200;

       // int n = 100;
      //  System.out.println(n+10);

        // String result = detectSign(number);
    //    System.out.println( detectSign(number) +":"+ detectSign(-100));

    //    System.out.println("Hello" +" world"+2);

        number = -34;
     //   System.out.println(detectSign(number));

        System.out.println("Enter a character: ");

        char ch = scanner.next().charAt(0);
      //  char ch = scanner.next().toLowerCase().charAt(0);

        scanner.close();

        System.out.println(findVowelConsonant(ch));
    }

    /*
    Задача 1
Написать метод, определяющий является ли целое число положительным, отрицательным или нулем.
Метод принимает целое число в качестве параметра и возвращает соответствующую строку.
В методе main вывести результат на экран
     */


     static String detectSign( int n){

        if( n > 0){
            return "Number is positive";
        }
        else if ( n < 0){
            return "Number is negative";
        }
        else{
            return "Number is zero"; }

    }

    /*
    Написать метод, который принимает в качестве параметра символ и проверяет является ли он гласной или согласной буквой латинского алфавита.
В зависимости от введенного символа ch метод возвращает следующую строку:
ch is a vowel ( это гласная)
ch is a consonant ( это согласная)
the symbol is not a letter ( символ не является буквой)

Буквы могут быть как заглавными, так и прописными.
При использовании сканера, для получения отдельного символа используйте конструкцию scanner.next().charAt(0)
В решении используйте switch и оператор if-else
В методе main выведите полученный результат на печать
     */

     static String findVowelConsonant( char ch){

         boolean isVowel = false;

         switch (ch) {
             case 'a':
             case 'i':
             case 'e':
             case 'u':
             case 'o':
             case 'A':
             case 'I':
             case 'E':
             case 'U':
             case 'O':  isVowel = true;

         }

         String result;

         if(isVowel){
             result = ch +" is a vowel";
         }
         else {
             if((ch <= 'z'&& ch >='a') || ( ch <= 'Z' && ch >= 'A' )) {
                 result = ch + " is a consonant";

             }

             else {
                 result = ch + "  is not a letter";
             }

         }
         return result;
     }

}
