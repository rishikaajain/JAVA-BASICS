import java.util.Scanner;

public class cwh_81 {
    public static void main(String[] args) {
        int [] arr =new int[3];
        arr[0]=7;
        arr[1]=70;
        arr[2]=700;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the array index:");
        int ind=sc.nextInt();

        System.out.println("Enter the no you want to divide with:");
        int no=sc.nextInt();

        try{
            System.out.println("value of array index enterd is:-"+arr[ind]);
            System.out.println("value of array-value/no is:-"+arr[ind]/no);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException Error occur!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("ArrayIndexOutOfBoundsException Error occur!");
            System.out.println(e1);
        }
        catch(Exception e2){
            System.out.println("otherException Error occur!");
            System.out.println(e2);
        }
        System.out.println("End of program !");
    }
    
}
