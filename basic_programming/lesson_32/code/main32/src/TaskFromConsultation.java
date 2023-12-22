public class TaskFromConsultation {

/*
    Пусть есть массив положительных целых чисел  нечетной длины >= 3.
    Известно, что существует индекс элемента этого массива такой, что сумма всех
    элементов слева от него равняется сумме всех элементов справа от него.
    Нужно написать метод, находящий этот индекс
    { 1,1,3,7,2,3}
    {1,3,2,1,6,200,13}

    1 2   3  2 1
    sum = 1+2+3+4+5
    leftSum = 1 + 2
    rightSum = 3+4+5
    sum = leftSum + rightSum
    leftSum = sum - rightSum
    rightSum = sum - leftSum


    leftSum =rightSum
    leftSum = sum - leftSum - num


    12
     */

    public static void main(String[] args) {
        int[] ints = { 1,1,3,7,2,3};
        System.out.println(balancedSum(ints));
    }

    public static int balancedSum( int ints[]){
        int sum = calculateSum(ints);

        int leftSum = ints[0];
        int lastPossibleIndex = ints.length - 2;
        int resultIndex = 0;

        for ( int i = 1; i <= lastPossibleIndex; i++){

            int currentNum = ints[i];

            if( leftSum == sum - leftSum - currentNum){
                resultIndex = i;
                break;
            }
            leftSum += currentNum;
        }
        return resultIndex;

    }

    private static int calculateSum( int[] arr){
        int sum = 0;
        for( int i : arr)
        {
            sum += i;
        }
        return sum;
    }
}
