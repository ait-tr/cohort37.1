import java.util.Scanner;

public class Practice {

    /*
    Написать программу, определяющую является ли год високосным.
    Условия високосности года:
    1. год должен без остатка делится на 4
    2. год не должен делится без остатка на 100
    3. если год делится без остатка на 100 он должен также делится без остатка на 400

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year ");
        int year = scanner.nextInt();

       // System.out.println(year/4.0);
       // System.out.println(year/100.0);
       // System.out.println(year/400.0);
        boolean result = true;

        //1. год должен без остатка делится на 4
        boolean a = (year % 4) == 0;

       // 2. год не должен делится без остатка на 100
        boolean b = (year % 100 ) != 0;

        //3. если год делится без остатка на 100 он должен также делится без остатка на 400
        boolean c = (year % 100 == 0) && ( year % 400 == 0);



      //  boolean result = logical expression
        System.out.println(" is " + year + " a  leap year ? "+ result /* + result*/ );
    }


}
