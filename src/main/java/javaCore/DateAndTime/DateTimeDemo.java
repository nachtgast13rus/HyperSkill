package javaCore.DateAndTime;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();  // 2022-10-04T10:27:53.285734900+03:00[Europe/Moscow]

        ZonedDateTime plus = now.plus(1L, ChronoUnit.DAYS);  // 2022-10-05T10:30:17.811467800+03:00[Europe/Moscow]


        ZonedDateTime truncated = now.truncatedTo(ChronoUnit.DAYS);  // 2022-10-04T00:00+03:00[Europe/Moscow]
        System.out.println(truncated);

    }
}
