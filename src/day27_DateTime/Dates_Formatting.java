package day27_DateTime;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {

    public static void main(String[] args) {

        // days_month_year

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");

        LocalDate date1 = LocalDate.now();

        System.out.println(date1.format(dtf));

        System.out.println(date1.format(dtf2));



    /*
    create a date called birthDay: month/day/year
            eX: 2020 04 23
            apr/23/20
     */

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("EEEE MMM/dd/yy");
        LocalDate date2 = LocalDate.of(1999, 12, 25);
        String str1 = date2.format(dtf3);

        System.out.println(str1);

        LocalDate date3 = LocalDate.now();

        System.out.println(date3.format(dtf3));
    }
}
