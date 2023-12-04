import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
       // System.out.println(isAnagram("abc","bac"));
      //  System.out.println(isAnagram("abc","bak"));
      //  System.out.println(isAnagram("abc","abca"));
      //  System.out.println(removeCharAtIndex("Hello",34));

        String java  = "Hello";

        System.out.println(java.substring(1,4));
        System.out.println(ourSubstring(java,1,4));

      //  System.out.println(java.substring(1,40));
        System.out.println(ourSubstring(java,1,40));




    }

    /*
    Задача 1
Задача про анаграммы - см. код занятия practice -> Practice
     */
    public static boolean isAnagram( String str1, String str2){
        /* abcd
           bcad
         */
        if(str1.length() != str2.length())
            return false;

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for( int i = 0; i < chars1.length; i++){
            if( chars1[i] != chars2[i])
                return false;
        }
        return true;
    }


    /*
    Задача 2
Написать метод, принимающий строку и целое число(индекс) и возвращающий строку без символа, находящегося по этому индексу.

Пример:
int index = 3
String str = "Hello"
*/

public static String removeCharAtIndex( String str, int index){
    return str.substring(0,index) +str.substring(index + 1);
    //return str.substring(0,index) +'*' +  str.substring(index + 1);

}

/*
Задача 3*
Написать свой собственный метод substring, работающий аналогично методу в Джаве.
Метод принимает строку , индексы начала и конца и возвращает подстроку.
String mySubstring( String string, int begin, int end).
 */

    public static String ourSubstring(String string, int begin, int end){
        String res = "";

        for( int i = begin; i< string.length()&& i < end;i++){
            res = res + string.charAt(i);
        }
        return res;
    }



}
