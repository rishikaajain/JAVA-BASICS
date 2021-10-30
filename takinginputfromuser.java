import java.util.Scanner;
public class takinginputfromuser {
    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner s=new Scanner(System.in);
     //    System.out.println("enter number 1");
     //    int a= s.nextInt();
     //     System.out.println("enter number 2");
     //   int b= s.nextInt();
     //   int sum=a+b;
     //   System.out.println("Sum of these numbers is:");
     //   System.out.println(sum);
    // System.out.println("Enter 1st floating value");
    // Float a=s.nextFloat();
    // System.out.println("Enter 2nd floating value");
    // Float b=s.nextFloat();
    // Float sum=a+b;
    // System.out.println("Addtion of numbers is:");
    // System.out.println(sum);
    //str=s.necx() issme space ni hona chiye .space de kr type kroge to 1st word hi 
    // read krega issliye nextline() use krte hai
    // String str=s.next();
   // String str=s.nextLine();
   // System.out.println(str);
   boolean b1=s.hasNextInt();
   System.out.println(b1);
    }
}
