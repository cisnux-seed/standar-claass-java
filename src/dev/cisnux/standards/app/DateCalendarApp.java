package dev.cisnux.standards.app;

import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class DateCalendarApp {
    public static void main(String[] args) {
        final Date date = new Date();
        long milliseconds = date.getTime();
        date.setMonth(Calendar.MARCH);

        System.out.println(date);
        System.out.println(milliseconds);

        final Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 8);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 12);
        calendar.set(Calendar.MILLISECOND, 12);

        final Date date1 = calendar.getTime();
        System.out.println(date1);
        System.out.println(date1.getTime());
    }
}
