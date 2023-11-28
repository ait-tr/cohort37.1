public class Main {

    // for-each loop  цикл for-each
    /*
    for ( type variable : array){
             statements

      }
      есть массив целых чисел. Нужно найти сумму значений всех его элементов


     */
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

    //    int sum = 0;

    //    for( int i = 0; i < numbers.length; i++){  // length = 5
    //        sum = sum + numbers[i];   0 + 10
    //        sum = sum + i;   0 + 0

            // sum += numbers[i];
   //     }
   //     int[] numbers = {10,20,30,40,50};
   //     System.out.println("Sum of all elements is " + sum);

        // with for-each
        System.out.println("With for-each");

        int sum = 0;

        for( int x :numbers){
            sum = sum + x;
           // sum += x;
        }
        System.out.println("Sum of all elements is " + sum);

        int[] ints = {10,20,30,40,50};

        System.out.println("Print ints array");
        for(int element : ints){

            if(element == 30)
                break;

            System.out.print(element +":");
        }
        System.out.println();
        System.out.println("An attempt to change elements with for-each");

        for( int element : ints){
            System.out.print(element + " ");
            element = element * 100;
        }
        System.out.println();

        for( int element : ints){
            System.out.print(element + " ");
        }










    }
}
