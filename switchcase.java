import java.util.Scanner;
//if esle and else if 
// above are also a conditional statment
public class switchcase {
    public static void main(String[] args) {
        String A="lava";
        String B="hello";
        String var="Rishika";
        switch(var){
            case  "Aman":
            System.out.println("You are going to become adult!");
            break;    
            case "Rishika":
            System.out.println("You are going to join a job !");
            break;   
            case "Stuti":
            System.out.println("You are going to get retired!");
            break; 
            default:
            System.out.println("You are going to become adult!");
        }
        System.out.println("Enjoy your life!");
System.out.println(A.length()+B.length());
System.out.println(A.compareTo(B)==1?"Yes":"No");
System.out.println(A.compareTo(B));
//compareTo returns difference of ascii values
    }
}
