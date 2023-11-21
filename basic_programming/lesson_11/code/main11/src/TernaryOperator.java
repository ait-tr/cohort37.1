public class TernaryOperator {
    public static void main(String[] args) {
        // variable = condition ? expression1 : expression2
        //   условие выполняется? да : нет

        int age = 10;

        if( age >= 18){
            System.out.println("Can vote? Yes");
        }
        else {
            System.out.println("Can vote? No");
        }

        boolean isAdult = age >= 18 ? true : false;
        System.out.println("can vote? " + isAdult );

        String isAdultString = age >= 18 ? "Yes" : "No";


        // find max
        int num1 = -15;
        int num2 = 30;

        int max = num1 >= num2 ? num1 : num2;
        System.out.println(max);

        int abs = num1 > 0 ? num1 : -num1;





    }
}
