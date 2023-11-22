public class Homework {
    public static void main(String[] args) {
      //  printMult(50);
        printTriangle(3);
    }

    /*
    Задача 1
Написать метод, выводящий на печать
 результат умножения данного числа n на все целые числа от 0 до n
     */

    static void printMult( int n){
        int i = 0;
        while (i <= n) {
            System.out.println(n + "*" + i + " = " + n * i);
            i++;
        }
    }

    /*
    Задача 2*
Написать метод, выводящий на печать треугольник, состоящий из цифр от 1 до числа n такого вида:
1
12
123
1234
12345
123456
     */

    static void printTriangle( int n){

        int i = 1;
        while (i <= n){ //i = 3

            int j = 1; // 1
            while(j <= i){ // 1<=3
                System.out.print(i);
               // System.out.print(j);
                j++; //3
            }
            i++; // 4
            System.out.println();
        }
    }

    /*
    1
1
22
333
4444
55555
     */
}
