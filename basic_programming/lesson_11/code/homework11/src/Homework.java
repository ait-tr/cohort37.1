public class Homework {
    public static void main(String[] args) {
      printCube(5);

    }

    /*
    Задача1
С помощью цикла while написать метод, выводящий на экран куб числа от 1 до заданного числа n.
static void printCube( int n )

Пример:для числа n=3

1 в кубе 1

2 в кубе 8

3 в кубе 27
     */

    static void printCube( int n ){
        int i = 1;

        while (i <= n){

            System.out.println("The number is: "+ i + " and cube of " + i +" is: "+(i*i*i));
            i++;
        }
    }
}
