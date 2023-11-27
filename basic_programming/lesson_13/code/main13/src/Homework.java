import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
      //  inputNumberAndPrintTable();
        printTriangle(6);
    }

 /*   Задача 1
    Написать метод, принимающий с клавиатуры положительное число и печатающий затем таблицу умножения для этого числа ( т.е. печатающий произведение этого числа на все числа от 1 до 10).
    Использовать в решении цикл for.

  */
    public static void inputNumberAndPrintTable()
    {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Enter a number");

        num = sc.nextInt();

        System.out.println("Multiplication table of " + num);

        for( int i = 1; i <= 10 ;i++)
        {
            System.out.println(num +" * " + i + " = " + (num*i));
        }
    }

    /*
    Задача 2
Переписать задачу про треугольник из предыдущего дз используя циклы for
     */

    public static void printTriangle( int n){
        for(int i = 1; i <= n; i++)
        {
            for( int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
