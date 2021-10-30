//write a program to calculate %tage of a given student in CBSE board exam.
//his marks for 5 subjects must be taken as i/p from the keyboard(mrks out of 100)
import java.util.Scanner;
public class challenges {
    public static void main(String[] args) {
        System.out.println("Precentage of student out of 100");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your English marks:-");
        Float a=sc.nextFloat();
        System.out.println("Enter your Hindi marks:-");
        Float b=sc.nextFloat();
        System.out.println("Enter your Maths marks:-");
        Float c=sc.nextFloat();
        System.out.println("Enter your Science marks:-");
        Float d=sc.nextFloat();
        System.out.println("Enter your Social Science marks:-");
        Float e=sc.nextFloat();
        Float sum=a+b+c+d+e;
        Float  P=sum*100/500;
        System.out.println("Your percentage is:-");
        System.out.println(P);

    }
}
// callenge 2:-write a program to add 3 numbers
//import java.util.Scanner;
//public class challenge2 {
 //   public static void main(String[] args) {
//        System.out.println("Addition of three numbers");
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter three numbers");
//        int a=s.nextInt();
//        int b=s.nextInt();
//        int c=s.nextInt();
 //       int sum=a+b+c;
 //       System.out.println("Sum of given numbers is:-");
 //       System.out.print(sum);
//    }
//}

// challenge 3:- write a program which ask user name and greets them with Hello<name>
//have a good day text
//import java.util.Scanner;

//public class challenge3 {

//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("What is  your name ?");
//        String str=s.nextLine();
//        System.out.println("Hello "+ str +",have a good day!!");
       
//    }
//}

// challenge 4:- Write a program to convert kilometers into meters
//import java.util.Scanner;
//public class challenge4 {

//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//       System.out.println("conversion of km to m");
//        System.out.println("Enter the kilometer:-");
//        int km=s.nextInt();
//        int m=km*1000;
//    }
//
//}
