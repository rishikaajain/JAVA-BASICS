import java.util.Scanner;
public class stringmethods {
    public static void main(String[] args) {
    
        String name="Rishika";
        System.out.println(name);

      /*  
     //length method returns length of string 
        int value = name.length();
        System.out.println(value);
     // toLowerCase method return a new string where all uppercase convert into lowercase
        String  lString = name.toLowerCase();
        System.out.println(lString);
    // toupperCase method return a new string where all lowercase convert into uppercase
        String  uString = name.toUpperCase();
        System.out.println(uString);

    */
    //trim method
   /*
    String nonTrimmedString ="    Rishika      ";
    System.out.println(nonTrimmedString);
    String trimmString=nonTrimmedString.trim();
    System.out.println(trimmString);
    */

    //substring method

    //indexting starts from 0
    System.out.println(name.substring(3));
    System.out.println(name.substring(2));    
    System.out.println(name.substring(0));
    //(being index,end index)
    System.out.println(name.substring(3, 5));
    System.out.println(name.substring(1, 7));
    System.out.println(name.substring(0, 3));

    //replace method
    System.out.println(name.replace( "i", "j"));
//i replace with j

//it is not neccessary that string return string value
//String can return int ,bool ,float ,string etc
    System.out.println(name.startsWith("Ris"));
    System.out.println(name.endsWith("Ris"));

//charAt method
System.out.println(name.charAt(2));
System.out.println(name.charAt(0));
System.out.println(name.charAt(1));
//indexof method
System.out.println(name.indexOf("i"));
System.out.println(name.indexOf("ijgiku"));
//lastindexof method
System.out.println(name.lastIndexOf("shi"));
System.out.println(name.lastIndexOf("shi",4));

//equals method
System.out.println(name.equals("Rishika"));//o/p true
System.out.println(name.equals("rishika"));//o/p flase

//equalsignorecase
System.out.println(name.equalsIgnoreCase("rishika"));//o/p true

//escape ssequence caharacters
// \n nextine, \t space tab ,\' single code ,\\ backslash etc;

}
}
