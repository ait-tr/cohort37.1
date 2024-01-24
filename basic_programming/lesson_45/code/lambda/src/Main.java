public class Main {
    public static void main(String[] args) {
        Operationable<Integer> operationable = (x,y)->(x+y);
        System.out.println(operationable.calculate(1,2));

        Operationable<String> stringOperationable = (x,y)->(x + y);
        System.out.println(stringOperationable.calculate("1","2"));

        // Лямбда как параметр метода. - Лямбда выражение можно передавать в качестве параметра  в метод

        int[] ints = {10,20,30,40,50};
        IsMoreInterface condition = n -> n > 20;
        System.out.println(condition.isMore(15));
        System.out.println(condition.isMore(25));

        System.out.println( sumIfCond(ints,condition));
        condition = n -> n < 30;
        System.out.println( sumIfCond(ints,condition));


    }
    public static int sumIfCond( int[] ints, IsMoreInterface lambdaExpression){
        int sum = 0;

        for( int element: ints){
            if(lambdaExpression.isMore(element)){
                sum += element;
            }
        }
        return sum;
    }
}
