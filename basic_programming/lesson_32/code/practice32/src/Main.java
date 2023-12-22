public class Main {

    /*
    Дана строка, состоящая из слов, разделенных пробелом. Слова состоят из маленьких латинских букв.
    Написать метод, позволяющий изменять слова в строке следующим образом:
    1.При длине слова = 3 изменять все буквы этого слова на заглавные
    При длине слова = 4 изменять все буквы этого слова на строчные
    При длине слова = 5 изменять все буквы этого слова на звездочки
    При написании программы использовать интерфейсы.

    "aaa BBBB dEF cFRgh bbb"  при условии 1 результат: AAA BBBB DEF cFRgh BBB
    "aaa BBBB dEF cFRgh bbb"  при условии 2 результат: aaa bbbb dEF cFRgh bbb
    "aaa BBBB dEF cFRgh bbb"  при условии 3 результат: "aaa BBBB dEF ***** bbb"
      */

    public static void main(String[] args) {
        String input = "aaa BBBB dEF cFRgh bbb";

        WordsTransformer wt = new WordsTransformer();

        WordsChecker wcUpper = new ToUpperCaseChecker();
        System.out.println(wt.transform(input,wcUpper));

        WordsChecker wcLower = new ToLowerCaseChecker();
        System.out.println(wt.transform(input,wcLower));

        WordsChecker wStar = new StarChecker();
        System.out.println(wt.transform(input,wStar));
    }

}
