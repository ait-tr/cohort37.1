//import java.util.Scanner;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        /*
        Написать программу, определяющую является ли введенное с клавиатуры целое число
        положительным, отрицательным или нулем. Программа выводит результат на экран
        Number is positive
        Number is negative
        Number is zero
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if( num > 0){
            System.out.println("Number is positive");
        }
        else if( num < 0){
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is zero");
        }

        System.out.println("Without else");


        if(num > 0) {
            System.out.println("Number is positive");
        }

        if( num < 0){
            System.out.println("Number is negative");
        }

        if( num == 0){
            System.out.println("Number is zero");
        }

    }
}
