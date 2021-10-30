import java.util.Scanner;
public class challenges2 {
    public static void main(String[] args) {
        //ques1 write a java program to convert a string to lower case
       /*
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:-");
        String name=sc.nextLine();
        name=name.toLowerCase();
        System.out.println(name);
        //ques2 write a program to replace spaces with underscore
        System.out.println(name.replace(" ", "_"));
        */
       //ques3 fill a letter template 
       //replace <!name!> with a string (some name)
       /*
       String letter="Dear <!name!> , Thanks a lot";
       System.out.println(letter);
       System.out.println(letter.replace("<!name!>", "Rishika"));
       */

       //ques4 write a program to detect double and triple spaces in a string
       String mysString="This string contains double and  triple spaces";
       System.out.println(mysString.indexOf("  "));
       System.out.println(mysString.indexOf("   "));

       //ques5 use escape sequence in given string
       String letter="Dear Rishika,You are very helpful and kind hearted girl .Thanks";
       System.out.println(letter);
       System.out.println("\"Dear Rishika\",\n\tYou are very helpful and kind hearted girl . \n Thanks");

    }
    
}
