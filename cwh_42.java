import java.util.jar.Attributes.Name;

class mymainemployee{

     public mymainemployee(){
         System.out.println("Default constructor");
     }
    public mymainemployee(String name ,int id){
    int  myid =id;;
    String  myname = name;
    System.out.println(myname);
    System.out.println(myid);
    }
}
public class cwh_42 {
    public static void main(String[] args) {
    mymainemployee m1=new mymainemployee();
     mymainemployee m=new mymainemployee("Rishika",101);
    }
}
