package trucks_.src;

public class PassengerCar extends Car{
    int numberOfSeats;
    public PassengerCar(String model,String manufacturer, int year, String colour, String owner,int numberOfSeats ){
        super(model,manufacturer,year,colour,owner);

        this.numberOfSeats = numberOfSeats;
    }

    public void move(){
        System.out.println(" passenger car is driving");
    }

    public void stop(){
        System.out.println("passenger car is stopping");
    }

    @Override
    public String toString() {
        return "Passenger Car{}" + super.toString();

    }
}
