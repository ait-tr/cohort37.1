public class Main {

    /*
    Задача 1
Создать класс Calculator, способный выполнять два арифметических действия -
сложение двух чисел, вычитание двух чисел
а также сложение трех чисел и вычитание трех чисел.
Калькулятор должен работать как для целых чисел, так и для чисел с запятой.
(т.е. в классе надо создать соответствующие методы и затем вызывать их в методе main)
     */

    public static void main(String[] args) {
            Calculator.plus(1,2,5);
            Math.max(1,2);
          //  Math.
            double a = 1;
       // System.out.println(a);
            double b = 2.35;
            int sum =(int) (a + b);
       // System.out.println(sum);

        System.out.println(Calculator.plus(2.5,3.6));
        System.out.println(Calculator.minus(5.5,3.5,1.0));
    }
}
