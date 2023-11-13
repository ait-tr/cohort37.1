import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Написать программу, которая принимает с клавиатуры имя , фамилию и возраст (Ваши или воображаемого персонажа) и выводит в консоль эту информацию в следующем виде:

First name: John

Last name: Smith

Age: 25
         */
        Scanner in = new Scanner(System.in);

        System.out.println("Input name ");
        String name  =in.nextLine();

        System.out.println("Input second name");
        String surname = in.nextLine();

        System.out.println("Input age");
        int personsAge = in.nextInt();


        System.out.println("You entered:" + name +" "+surname + " , age: " + personsAge);

        in.close();
    }
}
