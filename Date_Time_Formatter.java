package core_and_Advance_javaPrograms;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yy");
        System.out.println(d);
        String myDate = dt.format(d);
        System.out.println(myDate);


    }
}
