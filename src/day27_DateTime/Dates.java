package day27_DateTime;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020, 10,25);

        System.out.println(date1);

        LocalDate birthday = LocalDate.of(2000, 12, 25);

        System.out.println(birthday);
    }
}
