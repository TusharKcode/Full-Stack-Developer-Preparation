package Java.DateTimeAPI.Practice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTimeClasses {
    public static void localDateTimeApi(){
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDT = LocalDateTime.now();

        System.out.println("Current date is: " + currentDate);
        System.out.println("Current time is: " + currentTime);
        System.out.println("Current date & time is: " + currentDT);
        System.out.println();
    }

    public static void zonedTimeAndDate(){
        ZonedDateTime currentZone = ZonedDateTime.now();
        ZoneId zoneAsia = ZoneId.of("Asia/Kolkata");
        ZonedDateTime indiaZone = currentZone.withZoneSameInstant(zoneAsia);

        System.out.println("Current zone time is: " + currentZone);
        System.out.println("India time zone is: " + indiaZone);
        System.out.println();
    }

    public static void checkingPeriod(){
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, Month.DECEMBER, 11);

        Period gap = Period.between(date1, date2);
        System.out.println("Gap b/w dates " + "is a period of: " + gap);
        System.out.println();
    }

    public static void checkingDuration(){
        LocalTime time1 = LocalTime.now();
        System.out.println("The current time is: " + time1);
        
        Duration fiveHrs = Duration.ofHours(5);
        LocalTime time2 = time1.plus(fiveHrs);      // adding 5 hours to the current time & storing in time2
        System.out.println("After adding 5 hours of duration: " + time2);

        Duration timeGap = Duration.between(time2, time1);
        System.out.println("Duration gap b/w Time (1) & Time (2): " + timeGap);
        System.out.println();
    }

    public static void checkingChronoEnum(){
        LocalDate cd = LocalDate.now();
        LocalDate year = cd.plus(2, ChronoUnit.YEARS);      // adding 2 years to the current date
        LocalDate nextMonth = cd.plus(1, ChronoUnit.MONTHS);// adding 1 month to the current date
        LocalDate nextWeek = cd.plus(1, ChronoUnit.WEEKS);  // adding 1 week to the current date
        LocalDate decade = cd.plus(2, ChronoUnit.DECADES);  // adding 2 decades to the current date

        System.out.println("Current date is: " + cd);
        System.out.println("Next to next year is: " + year);
        System.out.println("Next month is: " + nextMonth);
        System.out.println("Next week is: " + nextWeek);
        System.out.println("20 Years after Today: " + decade);
        System.out.println();
    }

    public static void checkingAdjusters(){
        LocalDate ctDate = LocalDate.now();
        LocalDate dayOfNextMonth = ctDate.with(TemporalAdjusters.firstDayOfMonth()); // to get the first day of next month
        LocalDate nextSaturday = ctDate.with(TemporalAdjusters.firstDayOfMonth());  // get the next saturday
        LocalDate firstDay = ctDate.with(TemporalAdjusters.firstDayOfMonth());   // first day of current month
        LocalDate lastDay = ctDate.with(TemporalAdjusters.lastDayOfMonth());     // last day of current month

        System.out.println("Current date is: " + ctDate);
        System.out.println("First day of Next month is: " + dayOfNextMonth);
        System.out.println("Next Saturday from now is: " + nextSaturday);
        System.out.println("First day of month: " + firstDay);
        System.out.println("Last day of month: " + lastDay);
        System.out.println();
    }

    public static void formatDateTime(){
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        DateTimeFormatter formatter = builder.appendLiteral("Day is: ")
            .appendValue(ChronoField.DAY_OF_MONTH)
            .appendLiteral(", Month is: ")
            .appendValue(ChronoField.MONTH_OF_YEAR)
            .toFormatter();

        LocalDateTime dateTime = LocalDateTime.now();
        String str = dateTime.format(formatter);
        System.out.println(str);

        System.out.println();

        DateTimeFormatter parser
            = new DateTimeFormatterBuilder()
                    .appendPattern("[yyyy][yyyyMM][yyyyMMdd]")
                    .optionalStart()
                    .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
                    .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
                    .optionalEnd()
                    .toFormatter();
        System.out.println(parser.parse("2021", LocalDate::from));      // Execute if only year is given in parameter
        System.out.println(parser.parse("202106", LocalDate::from));    // Execute if year and month is given
        System.out.println(parser.parse("20210631", LocalDate::from));  // Execute if year, month and date is given
    }

    public static void main(String[] args) {
        localDateTimeApi();
        zonedTimeAndDate();
        checkingPeriod();
        checkingDuration();
        checkingChronoEnum();
        checkingAdjusters();
        formatDateTime();
    }
}
