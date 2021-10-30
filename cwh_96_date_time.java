public class cwh_96_date_time {
    public static void main(String[] args) {
        
        System.out.println("MilliSeconds: "+System.currentTimeMillis());

        System.out.println("Seconds: "+System.currentTimeMillis()/1000);

        System.out.println("Minutes: "+System.currentTimeMillis()/1000/60);

        System.out.println("Hours: "+System.currentTimeMillis()/1000/60/60);

        System.out.println("Days: "+System.currentTimeMillis()/1000/60/60/24);
        
        System.out.println("Years since 1970: "+System.currentTimeMillis()/1000/60/60/24/365);

        System.out.println("Maximum value of Long: "+ Long.MAX_VALUE);
        
        System.out.println("Maximum value of Long: "+ Integer.MAX_VALUE);

    }
}
