import inheritance.C;

import java.util.List;

public class Main {
    //Method overriding  Переопределение методов.
    /*
     - предоставляет возможность реализовать метод , уже существующий в родительском классе, в дочернем классе собственным
     способам
     В этом случае метод родительского класса называется overriden ( переопределеннным) , а метод дочернего класса
     overriding (переопределяющим)
     */

    public static void main(String[] args) {
        Truck truck = new Truck();
        // этот вызов напечатает реализацию метода drive()  из класса Truck
        truck.drive();
      //  truck.


        PassengerCar passengerCar = new PassengerCar();
        passengerCar.drive();

        // когда слева стоит ссылка на родительский класс и она  указывает на обьект родительского класса (справа),
        // то вызывается метод родительского класса
        Car car = new Car();
        car.drive();
        car.sound();
       // car.

        // а когда такая же ссылка  указывает на обьект дочернего класса (справа) то вызывается метод дочернего класса
        Car truck1 = new Truck();
        truck1.drive();
        truck1.sound();
        truck1 = new PassengerCar();

        /*
         В последнем случае обьект может вызывать переопределенные методы родительского класса и другие
          методы родительского класса но не может вызывать методы, реализованные только в дочернем классе

         */

        Truck truck2 = new Truck();
      //  truck2 = new PassengerCar();
        Car passenger = new PassengerCar();

        printCar(truck);
        printCar(passenger);


    }
    public static void printCar(Car car){
        car.drive();
        car.sound();
    }


}
