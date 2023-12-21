import java.util.Scanner;

public class DayOfWeekResolver {

    private static Scanner scanner = new Scanner(System.in);


    public void start(){
      do
      {
          DayOfWeek dayOfWeek = readDayOfWeek();
          System.out.println("It is " + isDayOff(dayOfWeek));

          System.out.println(" Do you want to check another day. Enter 'yes' or any other letter if not ?");
      }while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Thank you for using our service!");
        scanner.close();


    }



    private DayOfWeek readDayOfWeek(){
        System.out.println("Enter day of the week");
        String day = scanner.nextLine().toUpperCase();

        while(!(day.equals("MONDAY")||
                day.equals("TUESDAY")||
                day.equals("WEDNESDAY")||
                day.equals("THURSDAY")||
                day.equals("FRIDAY")||
                day.equals("SATURDAY")||
                day.equals("SUNDAY"))){
            System.out.println("You have entered the wrong day. Please enter the correct day");
            day = scanner.nextLine().toUpperCase();
        }

        return DayOfWeek.valueOf(day);
    }



    private boolean isDayOff(DayOfWeek day){
        switch (day) {

            case SATURDAY:
            case SUNDAY: return true;
            default: return  false;
        }
    }
}
