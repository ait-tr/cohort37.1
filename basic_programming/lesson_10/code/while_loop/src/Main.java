public class Main {

    // While loop -  цикл While

    /*
    while(condition)
    {
        statement(s) //  блок кода
    }
     */
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i);
         i++;
        System.out.println(i);
        i++;
        System.out.println(i);
        i++;
        System.out.println(i);
        i++;
        System.out.println(i);

        System.out.println("In while loop");

        int y = 2;

        while ( y < 6){
      //  while ( y%2 == 0){

            if(y%2 == 0) {
          //      System.out.println(y +" is even");
            }
           // else{
           //     System.out.println(y + " is odd");
          //  }

            y++; // 6
          //  y = y + 2;
        }
     //   System.out.println("after while");

        int k = 10;

        while (k >= 1){
          //  System.out.print(k + " ");

            k--;
        }

        char ch = 'a';

        while (ch <= 'z'){
            System.out.print(ch+" ");
            ch++;
        }

       // while (true){
       //     System.out.println(1);
       // }

        System.out.println("Count sum");
        // 1 +2 +3 + 4 + 5 = 15
        System.out.println(sumNumbers(5));
        System.out.println(sumNumbers(100));


    }
    static int sumNumbers( int n){

        int sum = 0;
        int i = 1;

        while(i <= n){

            sum = sum + i; // 1+2+3+4+5
            i++;
        }
        return sum;
    }

   /* do
   {

    } while(condition)

    */




}
