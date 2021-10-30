//interface is a group of related methods with empty bodies
interface bicycle{
    int s=12;
    void applybrake(int decrement);
    void speedup(int increment);
}
interface hornbicycle{
    void beephorn();
    void harshorn();
}
class  avoncycle implements bicycle,hornbicycle{
  public  void applybrake (int decrement){
       System.out.println("Apply brake!");
    }
   public  void speedup (int increment){
     System.out.println("Speed up!");
    }
   public void beephorn(){
       System.out.println("bee beee beeeee");
   }
   public  void harshorn() {
       System.out.println("pooo pooo poooo");
   }
}
public class cwh_54_interface {
    public static void main(String[] args) {
        avoncycle a=new avoncycle();
        a.applybrake(1);
        //you can create properties in interface
        System.out.println(a.s);
        //you cannot modify the properties of interface as they are final
       // a.s=56;//will throw error
      //  System.out.println(a.s);
       a.beephorn();
       a.harshorn();
   }
}
