package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class FindMonthOfDays {

    public static void findMonthOfDays() throws ParseException {

        /*

           Calendar cal = Calendar.getInstance();
          <p>
           int dayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

         */


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH); // yyyy-MM-dd
        Date firstDate = sdf.parse("2023-05-01");
        Date secondDate = sdf.parse("2023-07-08");

        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        int count = FindMonthOfDays.saturdaySundayCount(firstDate, secondDate);

        System.out.println("dayOfDiff : "+diff);

        System.out.println("Count of Sats & Sundays = "+count);
    }

    public static int saturdaySundayCount(Date d1, Date d2) {
        Calendar c1 = Calendar.getInstance();
        c1.setTime(d1);

        Calendar c2 = Calendar.getInstance();
        c2.setTime(d2);

        int sundays = 0;
        int saturday = 0;

        while (! c1.after(c2)) {
            if (c1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY ){
                saturday++;
            }
            if(c1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
                sundays++;
            }

            c1.add(Calendar.DATE, 1);
        }

        System.out.println("Saturday Count = "+saturday);
        System.out.println("Sunday Count = "+sundays);

        return saturday + sundays;
    }

    public static void main(String[] args) throws ParseException {
        FindMonthOfDays.findMonthOfDays();
    }
}
