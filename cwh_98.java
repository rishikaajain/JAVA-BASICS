import java.util.Calendar;
import java.util.TimeZone;

public class cwh_98 {
    public static void main(String[] args) {
        // Calendar c = Calendar.getInstance(); // Calendar Class is an Abstract Class so we cannot create an object of it
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());
        // // This is the time zone corresponding to the calendar instance created

        // // Replicating the above code

        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore")); // give timezone id

        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());

        // Time Zone of Calendar Class
        // This is the time zone corresponding to the calendar instance created
        
        System.out.println(c.getTime());
    }
}
