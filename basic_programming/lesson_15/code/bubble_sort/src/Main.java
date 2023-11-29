import java.util.Arrays;

public class Main {
    //  сортировка пузырьком  Bubble Sort
    /*
    Алгоритм проходит по массиву и сравнивает каждую пару соседних элементов. Когда встречается пара
    , расположенная не по порядку он меняет эти два элемента местами.
    6 3 0 5

    Первый проход
    6 3 0 5 -> 3 6 0 5 -> 3 0 6 5 -> 3 0 5 6

    Второй проход
    3 0 5 6 -> 0 3 5 6

    Третий проход
    0 3 5 6 -> 0 3 5 6
     */

    public static void main(String[] args) {

        int[] array = {6,3,0,5,-2,67,89,51};
        bubbleSort(array);


        for( int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("just print array");
        System.out.println(array);

        System.out.println("Array to String");
        System.out.println( Arrays.toString(array));



      boolean  sorted = true;
        sorted = false;
        sorted = true;
        System.out.println(sorted);
       // sout


        System.out.println(" sort with Arrays.sort");
        int[] ints = {6,1,0,-678,432,9};

        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

    }

  //  6 3 0 5 -> 3 6 0 5 -> 3 0 6 5 -> 3 0 5 6
    public static void bubbleSort(int[] array){

        boolean sorted = false;
        int temp;

        while (!sorted){
            //  цикл повторяется пока sorted = false
            sorted = true;

            for( int i = 0; i < array.length -1; i++){ // 2

                if( array[i] > array[i + 1]) { //  проверка необходимости перестановки соседних элементов
                    temp = array[i]; // 6
                    array[i] = array[i + 1]; //
                    array[i+1] = temp; //
                    /*
                    temp = a = 1
                    a = 1
                    b = 2
                     a = b = 2  //
                     b = temp = 1
                     */

                    sorted = false;
                }
            }
           // sorted = true;
        }

        /*
        sorted = true
        sorted = false
        sout
         */



    }
}
