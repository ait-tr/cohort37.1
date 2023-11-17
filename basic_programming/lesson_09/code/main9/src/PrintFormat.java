public class PrintFormat {

    public static void main(String[] args) {

        //форматированный вывод System.out.printf

        int a = 5;
        int b = 15;

        System.out.println("a = "+a +";b = "+b);
        System.out.printf("a = %d;b = %d",a,b);
        // %d -  спецификатор для вывода целочисленных значений
        // %с - для вывода символа
        // %s - для вывода строки
        // %f -  для вывода чисел с плавающей точкой

        String name = "John";
        int age = 25;
        float salary = 3000.76444f;

        System.out.printf("name: %s, age: %d, salary: %.2f",name,age,salary);
    }
}
