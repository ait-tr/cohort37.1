public class DEmo {
    public static void main(String[] args) {
        int[] numbers ={7,19,2,0,23,89};
        int value = 19;
      //  boolean isFound = false;

        for(int elt : numbers){
            if( elt == value){
                System.out.println("The value " + value +" is found");
             //   isFound = true;
                break;
            }
        }

    //    if(isFound){
    //        System.out.println("The value is found");
    //    }
        int[] array = {3,6,13,0};
        System.out.println("index of the element is " + findIndex(array,13));//2
        System.out.println("index of the element is " + findIndex(array,0));//3
        System.out.println("index of the element is " + findIndex(array,67));//-1

        int[] empty = {};
        System.out.println("empty length = " + empty.length);
        System.out.println("index of the element is " + findIndex(empty,67));//-1

        int[] test = new int[10];
        System.out.println("test length is " + test.length);

        for (int x : test){
            System.out.println(x);
        }
    }

    //  есть массив целых чисел , нужно написать метод находящий и возвращающий индекс
    // заданного элемента. Если такого элемента нет, то метод возвращает -1

    public static int findIndex( int[] array, int n){
        if(array.length == 0) { // проверка на отстутствие элементов в массиве
            return -1;
        }

        for (int i = 0; i < array.length; i++){

            if( array[i] == n){
                return i;
            }
        }
        return -1;
    }

    // написать метод, проверяющий равенство двух массивов целых чисел. В случае, если массивы равны, метод
    /*
    возвращает true,  если нет то false. Массивы равны если они одинаковые
    {1,2,3}
    {1,2,3}

     */

    public static boolean areEqual( int[] array1, int[] array2){

        if( array1.length != array2.length)
            return false;

        
        return true;
    }

}
