import java.util.Arrays;

public class CarInSalon {

    String[] salon;

    public CarInSalon( String[] salon){
        this.salon = salon;
    }

    public void findCar(String carToFind){

        for (String car : salon) {

            if (car.equalsIgnoreCase(carToFind)) {
                System.out.println("This car is available");
                return;
            }
        }

        System.out.println("This car is not available. Take");
        for(String car: salon)
            System.out.print(car + " ");
       // System.out.println(Arrays.toString(salon));
    }
}
