public class Main2 {

    // тип данных сhar

    /*
    система кодировки символов ASCII
     */
    public static void main(String[] args) {
        char ch;
        ch = 'X';
        System.out.println("This is character " + ch);
        ch++;
        System.out.println("This is now " + ch);

        ch = 66;
        System.out.println("66 in ASCII is " + ch);

        ch = '\'';
        System.out.println(ch);
        /*
         если нужно использовать специальный символ то к нему добавляется обратный слеш  \
          \"
          \\
          \n   символ печати с новой строки
          \t   горизонт. таб.
         */

        System.out.print("Hello\nJava\n");
        System.out.println("\tHello\tJava\tHello\t");

        // 'a' "a"
        char a = '5';
        String aString = "a";

        boolean bool = true;
        boolean bool1 = false;

    }
}
