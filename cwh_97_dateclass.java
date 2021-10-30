import java.util.Date;

public class cwh_97_dateclass {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getMinutes());
        System.out.println(d.getYear()); 
    }
}
