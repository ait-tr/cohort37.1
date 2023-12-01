public class Practice {
    public static void main(String[] args) {
       // System.out.println(lastToBegin("abcd"));
       // String res = "";
      //  res += 'a';

        System.out.println(removeDuplicateChars("abcabc"));
    }

    /*
    1. Написать метод, переставляющий последнюю букву строки в начало и возвращает результат
        abcd -> dabc
        hello
        substring(beginIndex,endIndex)
         beginIndex = 0;
         endIndex = str.length() - 1 = 5 -1 = 4
         substring(0,4)
        */

    public static String lastToBegin( String str){
        String str1 = str.substring(str.length() - 1);
        String str2 = str.substring(0,str.length()-1);

        return str1 + str2;
    }

    /*


    2. Написать метод, удаляющий из строки повторяющиеся буквы и возвращающий результат
     abab -> ab
     1. нужно превратить строку в массив символов
     2.нужно создать строку result , в которую будет добавляться символ , но только в том случае, если он
            туда еще не был добавлен. String result =""   result = result +chars[i]
     3. Для этого нужно пройти в цикле по массиву символов и добавлять в строку result  очередной символ но только
        в том случае, если его еще там нет.
        Проверить наличие в строке символа можно с помощью метода indexOf(). Если  этот метод возвращает -1 значит
        такого символа в строке еще нет.
      4. После окончания цикла нужно вернуть получившуюся строку

     str.indexOf('a')

     */
    // abcabc string
    // abcabc array
    public static String removeDuplicateChars( String string){
        char[] chars = string.toCharArray();
        String result ="";

        for (char aChar : chars) {
            if (result.indexOf(aChar) == -1)
                result += aChar;   // abc

        }
        return result;
    }

    /*



     3. Написать метод, принимающий две строки и проверяющий является ли одна строка анграммой другой.Метод
        возвращает boolean
        abcd  - bcda acbd - анаграммы
        abcd -    acb  abkc - не анаграммы

        Вам могут пригодиться следующие методы:
        toCharArray
        Arrays.sort




     */
}
