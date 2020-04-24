package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {

    public static void main(String[] args) {
        LocalDateTime DateTime1 = LocalDateTime.of(2015,12,25,11,30,45);
        System.out.println(DateTime1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MM/dd hh:mm a");

        String str = DateTime1.format(dtf);

        System.out.println(str);
    }

}
