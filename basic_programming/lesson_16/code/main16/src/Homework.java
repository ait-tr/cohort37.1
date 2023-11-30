public class Homework {
    public static void main(String[] args) {
        /*
        Задача1
Написать метод, принимающий массив целых чисел и проверяющий равна ли сумма всех имеющихся там чисел 10 тридцати.
Метод возвращает false если нет и true если да.
т.е. для массива 10, 15, 10, 1, 25, 10 -> true
для массива 10, 15, 10, 1, 25, 45 -> false
Фактически, в общем виде метод проверяет равна ли сумма всех элементов массива, равных n числу m
         */
        int[] numbers = {10, 15, 10, 1, 25, 10};
        int[] numbers1 = {10, 15, 100, 1, 25, 10};
        System.out.println(checkSum(numbers,10,30));
        System.out.println(checkSum(numbers1,10,30));
    }

    public static boolean checkSum( int[] numbers, int num, int sum){
        int tempSum = 0;

        for( int i = 0; i < numbers.length; i++){
            if(numbers[i] == num){
                tempSum += num;
              //  tempSum = tempSum + num;
            }
            if(tempSum > sum){
                break;
            }
        }
        return tempSum == sum;
    }
}
