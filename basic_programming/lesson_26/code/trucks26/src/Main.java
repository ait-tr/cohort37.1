package trucks_.src;

import java.util.Arrays;

public class Main {

    /*
    Создать класс грузовик Truck, содержащий общие характеристики грузовиков:
    model, manufacturer,year (год выпуска),colour,maxWeight (грузоподьемность),
    maxFuel (  обьем топливного бака), имя владельца
    и имеющий следующее поведение:
    1.должен уметь загружаться (load)  и при этом сообщать, если превышена его грузоподьемность а также сообщать
        сколько еще можно загрузить груза
    2.разгружаться и  при этом сообщать в случае если пытаются разгрузить больше чем имеющийся у него на борту груз
    или пытаются разгрузить отрицательный груз. Также должен сообщать вес остающегося на борту груза
    3. В случае отсутствия топлива или отсутствия груза на борту сообщать о невозможности ехать
    4. Должен уметь ездить и останавливаться
    4. уметь заправляться топливом
    5. уметь сообщать имя владельца

    Создать несколько грузовиков, протестировать их работу , сложить в массив и вывести на экран


     */
    public static void main(String[] args) {
        // Truck truck = new Truck();
        // System.out.println(truck.i);
        // System.out.println(truck.b);
        // System.out.println(truck.s);

        Car passengerCar = new PassengerCar("explorer",
                                        "ford",
                                                2015,
                                                "green",
                                                "smith",
                                                5);

        Truck truck = new Truck("SuperTruck",
                "Volvo",
                2020,
                "red",
                5000,
                500,
                "John Black");
        System.out.println(truck);
        Car truckCar = new Truck("SuperTruck",
                "Volvo",
                2020,
                "red",
                5000,
                500,
                "John Black");


        truck.load(1500);
        truck.load(10000);
        truck.load(3500);

        truck.move();
        truck.setCurrentFuel(600);
        truck.move();

        truck.stop();

        truck.unload(10000);
        truck.unload(2000);
        truck.unload(-1000);
        truck.unload(3000);

        Truck truck1 = new Truck("SuperTruck1",
                "MAN",
                2018,
                "black-yellow",
                10000,
                400,
                "Jack White");
        int[] x = {1, 2};
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        Car[] autos = {truck, truck1,passengerCar};
        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]);
        }
      //  System.out.println(Arrays.toString(trucks));
        System.out.println();

        for (Car car : autos) {
            System.out.println("Vehicle " + car.getManufacturer() + " : " + car.getOwner());
        }
        System.out.println("TruckCar");
        truckCar.move();
        truckCar.stop();
    }
}
