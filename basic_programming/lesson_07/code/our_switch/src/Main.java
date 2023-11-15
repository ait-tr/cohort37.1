import java.util.Scanner;

public class Main {
    // Switch

    /*
    switch(expression) { // переменная, контролирующая switch может быть одного из следующих типов:
                            int,byte,short,char,String
        case constant1:
         statements
         break;

        case constant2:
        statements
         break;

        case constant3:
        statements
         break;

         .
         .
         .
         default // определяет действия в случае если ни одна из констант не соответствует выражению в круглых скобках
          statements

    }
     */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number ");
            int i = scanner.nextInt();

            switch (i){
                case 34:
                    System.out.println(" i is 34");
                    break;

                case 1:
                    System.out.println("i is one");
                    break;

                case 20:
                    System.out.println("i is 20");
                    break;

                case 3:
                    System.out.println("i is three");
                    break;

                default:
                    System.out.println("i in not between 0 and 3");

            }

            System.out.println("After switch");


            char ch = 'b';

            switch (ch){

                case 'b' :
                 //   System.out.println("Case v");
                 //   break;
                case 'a':
                    System.out.println("Case a or Case b");
                    break;

                case 'y':
                    System.out.println("Case y");
                    break;

                default:
                    System.out.println("No such letter");

            }

    }
}
