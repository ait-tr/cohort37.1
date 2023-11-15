import java.util.Scanner;

public class HelpSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Our Help System. To see the info enter menu number");
        System.out.println("   1. if");
        System.out.println("   2. switch");

        int choice = scanner.nextInt();

        System.out.println("\n");

        switch (choice){
            case 1:
                System.out.println("IF:");
                System.out.println("if(condition)\n {statements}");
                System.out.println("else\n {statements}");
                break;
            case 2:
                System.out.println("SWITCH:");
                System.out.println("switch(expression) {");
                System.out.println("  case constant:");
                System.out.println("     statements");
                System.out.println("     break");
                System.out.println("   .........");
                System.out.println("   default");
                System.out.println("     statements");
                System.out.println("}");
                break;

            default:
                System.out.println("Please enter 1 or 2");
        }
    }
}
