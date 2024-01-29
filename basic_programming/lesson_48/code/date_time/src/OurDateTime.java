import java.time.*;
import java.util.Set;

public class OurDateTime {

    /*
    Date/Time API

    начиная с Java 8  появились новые классы для работы с датой и временем.
    Существовавшие до этого классы имели ряд недостатков:
    1. Не были потокобезопасными
    2. Плохой дизайн и работа методов
    3. Отсутствовал учет временных зон

    Основные  классы для работы с датой и временем сейчас:

    1.LocalDate
    2.LocalTime
    3.LocalDateTime
    4.ZonedDateTime
    5.Period
    6.Duration

    LocalTime
     */

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now(); //  текущее время
        System.out.println("Time now is " + localTime);

        // метод of() - создание обьекта LocalTime
        LocalTime localTime1 = LocalTime.of(15,30,35);
        System.out.println(localTime1);

        // получить часы
        System.out.println("hour: " +localTime1.getHour());
        System.out.println("minutes: " +localTime1.getMinute());

        LocalTime ourLocalTime = LocalTime.of(19,40,20);
        System.out.println("add hours:" + ourLocalTime.plusHours(2));
        System.out.println("add minutes:" + ourLocalTime.plusMinutes(10));
        System.out.println("add seconds:" + ourLocalTime.plusSeconds(20));

        // методы isBefore() and isAfter()- проверяют будет ли время на котором они вызываются позже
        // или раньше времени с которым оно сравнивается. Возвращает true/false

        LocalTime checkTime = LocalTime.of(13,15);
        System.out.println(checkTime.isBefore(LocalTime.now()));
        System.out.println(checkTime.isAfter(LocalTime.now()));

        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.NOON);

        // LocalDate - дата без указания временной зоны в формате год-месяц-день ( year-month-day)
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate localDate = LocalDate.of(2022,1,30);
        System.out.println(localDate);

        System.out.println("Is 2024 a leap year? " + now.isLeapYear()); // проверяет високосный год
        System.out.println("Is 2022 a leap year? " + localDate.isLeapYear()); // проверяет високосный год

        // отнимать /прибавлять дни, недели, месяцы
        LocalDate yesterday = now.minusDays(1);
        System.out.println("yesterday was " + yesterday);

        System.out.println(now.getDayOfWeek());
        System.out.println(now.getEra());
        System.out.println(now.lengthOfMonth());


        // LocalDateTime -  сочетание даты и времени
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2024,1,29,12,46);
        System.out.println(localDateTime1);

        // ZonedDateTime -  время/ дата с учетом временной зоны
        Set<String> availableZoneID = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneID);

        LocalDateTime nowDateTime = LocalDateTime.now();
        ZoneId london = ZoneId.of("Europe/London");
      //  ZonedDateTime inLondon = ZonedDateTime.of(nowDateTime,london);
      //  System.out.println("Time in London is " + inLondon);

        ZonedDateTime inBerlin = ZonedDateTime.now();
        System.out.println(inBerlin);

        ZonedDateTime inLondon = ZonedDateTime.now(london);
        System.out.println(inLondon);


    }
}
