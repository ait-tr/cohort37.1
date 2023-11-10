import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        //  Чтение с клавиатуры с помощью сканера

       //  создание сканера
        Scanner ourScanner = new Scanner(System.in);

        System.out.println("Enter a name ");
        String name = ourScanner.nextLine(); // введение строки с клавиатуры

        System.out.println("Enter a surname ");
        String secondName = ourScanner.nextLine();

        System.out.println("Enter age");
        int age = ourScanner.nextInt();


        System.out.println("The name is  " + name + " "+secondName + ", age is " + age);

    }
}
