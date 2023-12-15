public class Main {

    /*
    Геометрические фигуры
    Используя свойства наследования написать программу для подсчета площади трех видов фигур -
    круга, прямоугольника и квадрата.

    Создать классы Circle, Rectangle, Square , содержащие соответствующие методы.
    Затем в методе main создать маcсив из нескольких фигур и вывести на печать площади каждой фигуры и название ее
    примерно в таком виде :
    Circle has area of 100.0
    Rectangle has area of 400.0
    Square has area of 340.0

     */

    public static void main(String[] args) {
        Shape circle = new Circle("Circle",10.0);
        Shape rectangle = new Rectangle("Rectangle",5.0,10.0);
        Shape square = new Square("Square",5.0);
      //  Shape shape = new Shape("Shape");

        System.out.println(circle);


        Shape[] shapes = {circle,rectangle,square};

        for( Shape s : shapes){
            System.out.println(s.getName() +" has area of " + s.findArea());
            System.out.println();
        }

        for( Shape s : shapes){
            System.out.println(s);
        }
    }
}
//getClass().getName() + '@' + Integer.toHexString(hashCode())