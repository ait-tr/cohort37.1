import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        /*
        Напишите метод калькулятор, который в зависимости от ввода
        пользователя выполняет сложение, вычитание, умножение или деление. Пользователь вводит оба числа,
        затем знак операции (+, -, * или /). В зависимости от введенного знака программа выполняет выбранное
        действие и выводит полученный результат на экран.
        При написании метода используйте Switch.
         */
        Scanner scanner = new Scanner(System.in);
       // String result = scanner.nextLine();

        double num1, num2;

        System.out.println("Enter first number:");
        num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        num2 = scanner.nextDouble();

        scanner.nextLine();


        System.out.println("Enter an operator(+,-,/,*");
        String operator = scanner.nextLine();


        switch (operator){

            case "+":
                System.out.println(num1 +" "+ operator +" " + num2 + "= "+ (num1 + num2));
                break;
            case "-":
                System.out.println(num1 +" "+ operator +" " + num2 + "= "+ (num1 - num2));
                break;

            case "*":
                System.out.println(num1 +" "+ operator +" " + num2 + "= "+ (num1 * num2));
                break;

            case "/":
                if( num2 == 0){
                    System.out.println("Division by zero is forbidden");
                    break;
                }
             //   else
                    System.out.println(num1 + " " + operator + " " + num2 + "= " + (num1 / num2));

                break;

            default:
                System.out.println("You have entered the wrong operator");
        }

        String hello = "Hello";
        hello = "Bye-bye";
        char h = hello.charAt(0);
        System.out.println(hello);
        System.out.println( hello.toUpperCase());

    }
}
