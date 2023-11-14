public class Main {
    public static void main(String[] args) {


        // If statement
      // 1. if( condition ) statement
        int num = 200;
        if( num <= 100) {
        //    System.out.println("num <= 100");
        }

      //  System.out.println("After if statement");


        // 2.if else statement
      /*
        if( condition ){
            statement
            }
        else {
        statement
        }
       */
        num = 200;
        if( num <= 100) {
      //      System.out.println("num <= 100");
        }
        else{
      //      System.out.println("num > 100");
        }

        //3. if  внутри if
        /*
        if( condition1){
            statements;

            if(condition 2){
              statements;
            }
        }
         */

        int number = 30;

        if( number < 100){
        //    System.out.println(" number is less 100");

            if(number > 40){
          //      System.out.println("number is greater than 40");
            }
         //   else

        }
      //  else

        //4. if-else-if
        /*
        if(condition)
          statement
        else if (condition)
            statement
        else if (condition)
            statement
            .
            .
            .
            .
         else
            statement
         */

        int x = 7;

        if( x == 1) {
            System.out.println("x = 1");
        }
        else if( x == 2) {
            System.out.println("x = 2");
        }
        else if ( x == 3) {
            System.out.println("x = 3");
        }
        else if ( x == 4) {
            System.out.println("x = 4");
        }
        else {
            System.out.println(" x is not between 1 and 4");
        }

        System.out.println("if-else is finished");


        //  Определить количество цифр положительного числа
        // 1234

        int i = 1;

        if(i < 10 && i >= 1 ){
            System.out.println("It is a one digit number");
        }
        else if (i < 100 && i >= 10){
            System.out.println("It is a two-digit number");
        }
        else if(i < 1000 && i >= 100){
            System.out.println("It is a three-digit number");
        }
        else{
            System.out.println("The number has  more than 3 digits");
        }

    }
}
