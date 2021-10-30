interface camera{
    void takesnap();
    void recvideo();
    private void greet1(){
        System.out.println("Greetings of the day !");
    };//private method cannot access but if we use this method in default
    //then it will run without throwing error
 //  void rec4kvideo();//will throw error in classes as this method is not there
    //supoose we have many classes and we use this interfaces . after completion
    //of code we want to update our interface method then it will throw error so avoid
    //error we use default .
   default void rec4kvideo(){
       greet1();
        System.out.println("Recording in 4k...");

    }
 //you can reimplement rec4kvideo method in other class as well!
}
interface wifi{
    String[] getnetworks();
    void connecttonetwork(String methods);
}
class mycellphone{
    void callnumber(int phonenumber){
        System.out.println("calling"+phonenumber);
    }
    void pickcall(){
        System.out.println("connecting....");
    }
}
class  Mysmartphone extends mycellphone implements wifi,camera{
   public  void takesnap(){
        System.out.println("taking snap");
    }
    public  void recvideo(){
        System.out.println("recording ...");
    }
    // public void rec4kvideo(){
    //     System.out.println("Taking snap and rec4k...");
    // }
    //if we overwrite the default interface method in class then 
    //in main when we call the method then overwrite method is call instead of
    //default interface method! 
    public String[] getnetworks(){
        System.out.println("Getting list of networks...");
        String[] networkList={"Rishika","Aman401","Kishan2002"};
        return networkList;
    }
    public void connecttonetwork(String network){
        System.out.println("connecting to.."+network);
    }
}
public class cwh_57 {
    public static void main(String[] args) {
        Mysmartphone ms=new Mysmartphone();
        ms.rec4kvideo();
       // ms.greet1();//will throw error
        String[] arr =ms.getnetworks();
        for (String item : arr) {
            System.out.println(item);
        }
    }
}
