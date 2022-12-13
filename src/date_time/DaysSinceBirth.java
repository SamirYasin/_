package date_time;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysSinceBirth {

    public static void main(String[] args) {

    LocalDate today = LocalDate.now();
    LocalDate dateOfBirth = LocalDate.of(1999, Month.JULY, 16);

    System.out.println(today);
    System.out.println(dateOfBirth);

    System.out.println(ChronoUnit.DAYS.between(dateOfBirth, today));

        LocalTime localTime1 = LocalTime.of(23,59,59);
        LocalTime localTime2 = LocalTime.of(0,0,1);
        System.out.println(Duration.between(localTime2,localTime1).getSeconds());
    }

}
