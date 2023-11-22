public class Example {
    public static void main(String[] args) {

       // System.out.println(countSum(5));

        int sum = 0;

        for( int i = 1 ; i <= 5 ; sum += i++);

        // i++
        // ++i

        /*
        sum += i++:
        1. sum +i ( 0 + 1)
        2. sum = sum+i (1)
        3. i= i +1
         */


        System.out.println("sum is " + sum);

    }
    // написать метод, считающий и возвращающий сумму чисел от 1 до 5  ( n= 5). Использовать цикл for
    static int countSum( int n){

        int sum = 0;

        for( int i = 1 ; i <= n ; i++){

           // sum = sum + i; //1+2+3+4+5
            sum += i;
        }

        return sum;


    }
}
