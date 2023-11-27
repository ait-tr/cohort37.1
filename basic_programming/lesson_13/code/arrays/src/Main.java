import java.util.Scanner;

public class Main {

    /*
    Arrays
    Массивы в джаве
    Массив - это набор однотипных  элементов
     type[] array-name = new type[size]
     */
    public static void main(String[] args) {
       // int[] sample = new int[10];
        int[] sample;
        sample = new int[10];

       /*
        sample[0]
        sample[9]

        size = 10;
        sample[size -1]
        */
        sample[0] = 45;// присвоение элементу массива значения
        System.out.println("Zero element of sample array is " + sample[0]);
        sample[1] = 45;
        sample[2] = 45;
        sample[3] = 45;
        System.out.println("First element of sample array is " + sample[1]);
        System.out.println("Second element of sample array is " + sample[2]);

        sample[2] = 21;
        System.out.println("second elt now is " + sample[2]);

        // int[] sample
        // int []sample
        // int sample[]

        //второй спосб обьявить массив и присвоить значения элементам
        int[] numbers = new int[]{10,34,6,78,97};
        //  0  1  2  3  4
        //{10,34, 6, 78,97}
        // H  e   l  l  o
        System.out.println("zero elt of numbers is " + numbers[0]);
        System.out.println("the last elt of numbers is " + numbers[4]);


        // третий способ создания массива
        System.out.println("Array nums");
        int[] nums = {34 , 56 , 89,4,1,90};
       // int[] nums = {34,56,89,4,1,90,567};
       // nums =  {34,56,89};

        int a = 3;
       // int a = 5;
        a = 8;

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);

        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println(nums[5]);
      //  System.out.println(nums[6]);
        nums[5] = 9;
        System.out.println("nums[5] now is " + nums[5]);

        // length - размер массива
        int numsLength = nums.length;
        System.out.println("nums length = " + numsLength);
        System.out.println("nums length = " + nums.length);

        System.out.println("array nums printed in cycle");
        //  вывести массив nums  на печать  в цикле
        for (int i = 0; i < nums.length; i++){
            System.out.println("nums[" + i + "] = " + nums[i]);
        }

        //  создать массив из 10 элементов, заполнить его элементами от 0 до 9 и вывести на печать в цикле
        System.out.println("ints array:");
         //1. обьявляем массив из 10 элементов целого типа
        int[] ints = new int[10];

        // 2. присваиваем значения элементам массива
        for (int i = 0; i < ints.length; i++){
            ints[i] = i + 10;
        }
        // выводим значения элементов на печать
        for (int i = 0; i < ints.length; i++){
            System.out.println("ints[" + i + "] = " + ints[i]);
        }

       // ints[0] = "John"
        //                  0        1     2     3
        String[] names = {"John ","Mary","Ann","Bill"};


      //  String name = "Jack";
      //  String name1 = new String("Jack");

        for( int i = 0; i < names.length; i++){
            System.out.println("names[" + i + "] = " + names[i]);
        }

        names[1] = "Kate";
        System.out.println("with Kate");
        for( int i = 0; i < names.length; i++){
            System.out.println("names[" + i + "] = " + names[i]);
        }

        names[names.length -1] = "Tom"; // последний элемент
        names[names.length - 2] = "Peter";
        System.out.println("with Tom");
        for( int i = 0; i < names.length; i++){
            System.out.println("names[" + i + "] = " + names[i]);
        }

        String[] fruits = new String[5];
        fruits[0] = "Banana";


        for( int i = 0; i < fruits.length; i++){
            System.out.println("fruits[" + i + "] = " + fruits[i]);
        }
        // создаем новый массив длиной на два элемента больше чем старый
        String[] newNames = new String[names.length + 2];

        // копируем элементы из старого в новый
        for (int i = 0; i < names.length;i++){
            newNames[i] = names[i];
        }

        System.out.println("newNames");
        for( int i = 0; i < newNames.length; i++){
            System.out.println("newNames[" + i + "] = " + newNames[i]);
        }

        newNames[newNames.length -1 ] = "Ben";
        newNames[newNames.length -2 ] = "Harry";

        System.out.println("newNames");
        for( int i = 0; i < newNames.length; i++){
            System.out.println("newNames[" + i + "] = " + newNames[i]);
        }
        // найти и вывести на печать мин и макс эл-ты массива
        int[] array = {5,2,8,0,1,45};
            int max = array[0];

        for (int i = 1; i < array.length; i++){
            if(array[i] > max)
                max = array[i];
        }
        System.out.println(max);
        System.out.println(Integer.MAX_VALUE);





    }
}
