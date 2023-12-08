public class Car {
 private    String name;
 private int year;
 private   static  int carCounter;

    public Car( String name){
        this.name = name;
        this.year = 2000;
        carCounter++;
    }

    public static int getCarCounter(){
        return carCounter;
    }

    public static void setCarCounter(int numberOfCars){
        carCounter = numberOfCars;
    }

    public String getName(){
        return name;
    }

    public static String getCarInfo(Car car){
        return car.getName() +" , production year " + car.year;
    }


}
