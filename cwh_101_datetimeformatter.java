import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); //this is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-YYYY--E H:m");//this the format
        DateTimeFormatter df1=DateTimeFormatter.ISO_LOCAL_DATE;

        String mydate =dt.format(df);//creating date string using date and format
        System.out.println(mydate);
    }
}
