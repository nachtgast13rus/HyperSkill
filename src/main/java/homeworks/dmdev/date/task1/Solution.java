package homeworks.dmdev.date.task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime newTime = now.plusMonths(3L);
        System.out.println(newTime.toLocalDate());
        System.out.println(newTime.toLocalTime());

        System.out.println(now.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")));

        String s = "26-03-1968T09:24";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime str = LocalDateTime.parse("26-03-1968T09:24", dateTimeFormatter);
        System.out.println(str);

    }
}
