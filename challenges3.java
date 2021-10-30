import java.net.PasswordAuthentication;
import java.util.Scanner;
public class challenges3 {
    public static void main(String[] args) {
  //q1 find out student is pass or fail
  // if requires total 40% to and atleast 33% in each subject to pass
  //assume 3 subjects and take marks as an i/p from the user

  Scanner sc=new Scanner(System.in);
  /*
  System.out.println("Enter your subject 1 marks:-");
  float m=sc.nextFloat();
  System.out.println("Enter your subject 2 marks:-");
  float m1=sc.nextFloat();
  System.out.println("Enter your subject 3 marks:-");
  float m2=sc.nextFloat();
  float total=m+m1+m2;
  float percentage=(total*100)/300;
  System.out.println("your percentage is:-");
  System.out.println(percentage);
  if(percentage>=40 || percentage==33)
  System.out.println("congrats!! you are pass");
  else
  System.out.println("oops!!  you are fail");
  */
  
  //q2 calculate income tax paid by an employee..
/*
  System.out.println("Enter the amount(in lakh):-");
  float amount=sc.nextFloat();
  if(amount>2.5 && amount <5f){
      System.out.println("Your income tax is 5%");
  }else if(amount>5 && amount<10){
      System.out.println("Your income tax is 20%");
  }else if(amount>=10.0){
      System.out.println("Your income tax is 30%");
  }else{
      System.out.println("There is no tax below 2.5L");
  }
*/

//q3 find out the day of week given no {1 for monday , 2 for tuesday........an so on}
/*
System.out.println("Enter a integer:");
int a=sc.nextInt();
switch(a){
    case 1:
    System.out.println("Monday");
    break;
    case 2:
    System.out.println("Tuesday");
    break;
    case 3:
    System.out.println("Wednesday");
    break;
    case 4:
    System.out.println("Thursday");
    break;
    case 5:
    System.out.println("friday");
    break;
    case 6:
    System.out.println("Sat");
    break;
    case 7:
    System.out.println("Sunday");
    break;
    default:
    System.out.println("Invalid integer!!");
}
*/
//q4 find type od website
System.out.println("Enter the website url :-");
 String s=sc.nextLine();
 if(s.endsWith(".com"))
 {
     System.out.println("commercial website");
 }else if(s.endsWith(".org")){
     System.out.println("organization website");
 }else{
     System.out.println("indian website");
 }


}
}
