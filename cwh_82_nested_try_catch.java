
import java.util.Scanner;
public class cwh_82_nested_try_catch {
    public static void main(String[] args) {
        int [] arr =new int[3];
        arr[0]=7;
        arr[1]=70;
        arr[2]=700;
        Scanner sc =new Scanner(System.in);
       // boolean flag=true;
        System.out.println("Enter the array index:");
        int ind=sc.nextInt();
     // while(flag){
        try{
            System.out.println("Welecome to my world!");
            try{
                System.out.println(arr[ind]);
               // flag=false;
            }        
            catch(ArrayIndexOutOfBoundsException e){
              System.out.println("Index not available");
              System.out.println("Exception at level 2");
             }
          }
          catch(Exception e1){
              System.out.println("Exception at level 1");
          }
       //}

    }
}
