class Phone{
    public void showtime(){
        System.out.println("Its 8pm");
    }
    public void on(){
        System.out.println("Turning on .....");
    }

}  
class SmartPhone extends Phone{
     public  void greet(){
         System.out.println("Good morning!");
     }
     public void on() {
         System.out.println("Turning Samrtphone on.....");
     }
     public void music() {
         System.out.println("playing music");
     }
} 
public class cwh_49 {
    public static void main(String[] args) {
        // Phone obj =new Phone();//allowed
        // SmartPhone sobj=new SmartPhone();//allowed
        // obj.showtime();//allowed
       
        // Dynamic method dispatch............
        Phone obj = new SmartPhone(); //allowed
        //obj will create on run time
        //therefore dynamic method dipatch is RUN-TIME PLOYMORPHISM
        //here we give the reference of superclass or parent class
        //and create a object of subclass or child class but vice versa is not allowed
       // SmartPhone sobj=new Phone();//not allowed
      obj.showtime();
      obj.on();
     // obj.music();//will throw error


     //only methods which are available in parent class can be called
     //music() is from subclass which are not present in parent class therefore it will throw an error
     
    

    }
}
