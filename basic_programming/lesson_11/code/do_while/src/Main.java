import java.util.Scanner;

public class Main {
    // do-while
    /*
    do
    {
    statements
    } while(condition)
    Отличие этого цикла от while  в том, что do-while  выполняется хотя бы один раз
     */
    public static void main(String[] args) {
        int i = 0;

        do {
       //     System.out.println(i);
            i--;
        }while (i > 1);

        example();
    }

    static void example(){

        Scanner scanner = new Scanner(System.in);
        char ch;

        do {
            System.out.println("Enter a letter/ q to quit");
            ch = scanner.next().charAt(0);

            System.out.println("you have entered " + ch);

        }while(ch != 'q');
    }

}
