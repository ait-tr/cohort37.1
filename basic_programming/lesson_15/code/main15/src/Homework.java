public class Homework {

    public static void main(String[] args) {
        int[] ints1 = {1,2,3,4};
        int[] ints2 = {1,2,3,4};
        int[] ints3 = {1,27,3,4};

        System.out.println(areEquals(ints1,ints2));
        System.out.println(areEquals(ints1,ints3));

        System.out.println("countEven result: " + countEven(ints1));

        System.out.println("count sum and even");

        int[] result = countEvenAndSum(ints1);

        System.out.println("the number of even integers in array " + result[0]);
        System.out.println("the sum of even integers in array " + result[1]);


    }


    /*
    Задача1
Доделать задачу про равенство двух массивов целых чисел
( см. код занятия for_each DEmo)
*/
  public static boolean areEquals( int[] arr1, int[] arr2){
      if( arr1.length != arr2.length)
          return false;

      for(int i = 0; i < arr1.length; i++){
          if ( arr1[i] != arr2[i]){
              return false;
          }
      }
      return true;
  }

/*
Задача2
Есть массив целых чисел. Написать метод, находящий и возвращающий количество четных
чисел в этом массиве. Пример: {1, 2, 8, 7} -> количество четных чисел = 2.
     */

    public static int countEven( int[] numbers){
        int counter = 0;


        for( int i = 0; i < numbers.length; i++)
        {
            if( numbers[i] % 2 == 0)
                counter++;
        }
        return counter;
    }


    public static int[] countEvenAndSum( int[] numbers){
        int counter = 0;
        int sum = 0;
        int[] res = new int[2];


        for( int i = 0; i < numbers.length; i++)
        {
            if( numbers[i] % 2 == 0) {
                counter++;
                sum = sum + numbers[i];
            }
        }
        res[0] = counter;
        res[1] = sum;

        return res;
    }


}
