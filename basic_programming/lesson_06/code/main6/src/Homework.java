public class Homework {

    public static void main(String[] args) {
        /*
        Пусть есть две переменные целого типа a и b. Написать программу,
        печатающую true если значение хотя бы одной из этих переменных равно 10 или сумма значений этих переменных
        равна 10
        a = 10 либо b=10 либо a+b=10
         */
        int a;
        int b;

        a = 6;
        b = 4;
        System.out.println(  a == 10 || b == 10 || a + b == 10);

        if(a == 10 || b == 10){
            System.out.println("True");
        }


    }
}
