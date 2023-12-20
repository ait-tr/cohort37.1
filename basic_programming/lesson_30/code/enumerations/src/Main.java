public class Main {

    // ENUM

    public static void main(String[] args) {
        Week dayOfWeek = Week.MONDAY;
        System.out.println(dayOfWeek);

        switch (dayOfWeek){

            case MONDAY:
                System.out.println("This is Monday");
                break;
            case TUESDAY:
                System.out.println("This is Tuesday");
                break;

            case WEDNESDAY:
                System.out.println("This is Wednesday");
                break;

            case THURSDAY:
                System.out.println("This is Thursday");
                break;

            case FRIDAY:
                System.out.println("This is Friday");
                break;

            case SATURDAY:
                System.out.println("This is Saturday");
                break;

            case SUNDAY:
                System.out.println("This is Sunday");
                break;

            default:
                System.out.println("This is not a valid day of week");
        }

        // методы enum  values() and valueOf()

        // values() -  возвращает список всех констант энума

     //   Week[] allDays = Week.values();
     //   for(Week day : allDays){
     //       System.out.println(day);
     //   }


        for(Week day : Week.values()){
            System.out.println(day);
        }

     Week  day = Week.valueOf("TUESDAY"); //
        System.out.println(day);

   //  Week wrongDay = Week.valueOf("Wed"); будет ошибка


    Transport transport;

        System.out.println(Transport.CAR.getSpeed());
        System.out.println(Transport.TRAIN);

    }
}
