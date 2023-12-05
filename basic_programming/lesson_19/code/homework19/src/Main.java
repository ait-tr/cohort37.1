public class Main {

  /*  Задача 1
    Создать класс Student c полями (переменными) имя и возраст.
    Создать несколько обьектов этого класса. Вывести их на печать

   */
  public static void main(String[] args) {
      Student mike = new Student();
     // mike.
      mike.name = "Mike";
      mike.age = 20;
      mike.age = 0;
      System.out.println("name is " + mike.name + " ,age is " + mike.age);

      Student jack = new Student();
      jack.name = "Jack";
      jack.age = 25;
      System.out.println("name is " + jack.name + " ,age is " + jack.age);

      System.out.println("compare mike and jack " + (mike == jack));


      //mike E8
      // jack A7
      mike = jack; //A7
      System.out.println(mike.name);
      System.out.println("compare mike and jack 2 " + (mike == jack));

      jack = null;
      mike = null;
   //   System.out.println(mike.name);

      Student bill = new Student();
      bill.name ="Bill";
      bill.age = 35;

      System.out.println("printing mike");
      mike = bill;
      System.out.println(mike.name);
      System.out.println(mike.age);

      System.out.println("printing bill");
      System.out.println(bill.name);
      System.out.println(bill.age);





      /*
      Задача 2
Создать класс Rectangle (прямоугольник), содержащий переменные длина и ширина,
конструктор и методы для подсчета площади и периметра прямоугольника.
В классе Main создать несколько обьектов класса
Rectangle и вывести на экран площадь и периметр каждого
       */

      Rectangle a = new Rectangle(5,6);
      Rectangle b = new Rectangle(1,2);

      Rectangle rect1 = new Rectangle(1,2);
      Rectangle rect2 = new Rectangle(1,2);
      Rectangle rect3 = new Rectangle(1,2);

      System.out.println("Rectangle a area is " + a.getArea() + " , perimeter is " + a.getPerimeter());
      System.out.println("Rectangle b area is " + b.getArea() + " , perimeter is " + b.getPerimeter());
      System.out.println("Rectangle rect1 area is " + b.getArea() + " , perimeter is " + b.getPerimeter());

        Rectangle rectangle1 = new Rectangle(2,2);
        Rectangle rectangle2 = new Rectangle(2,2);
      System.out.println("Rectangles are equal? " + (rectangle1 == rectangle2));
     // System.out.println(rectangle1.equals(rectangle2));

  }
}
