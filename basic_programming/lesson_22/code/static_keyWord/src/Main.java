public class Main {

    /*
    Статические методы также как и переменные принадлежат классу и не зависят от обьекта. Их можно также вызывать
    без создания соответствующего обьекта, а используя имя класса.
    Cтатические методы часто используются во вспомогательных классах ( например класс Math)

     */

    public static void main(String[] args) {
        Car car = new Car("BMW");
        Car car1 = new Car("BMW1");
        System.out.println(Car.getCarCounter());
        Car.setCarCounter(10);
        System.out.println(Car.getCarCounter());

        System.out.println( Car.getCarInfo(car));

     //   Main m = new Main();
     //   m.printSmth();


      //  Math.

        // Статические блоки - используется для присвоения начального значения статическим переменным

    }


    public void printSmth(){
        System.out.println("Hello");
    }
}
