public class Homework {
    /*
    Задача 1
Создать класс Dog c полями name , counter и конструктором. Cоздать несколько
обьектов этого класса и вывести на печать количество созданных обьектов.
     */

    public static void main(String[] args) {
        Dog sharik = new Dog("Sharik");
        Dog tuzik = new Dog("Tuzik");
        System.out.println("The number of dogs is " + Dog.dogCounter);
    }
}
