import java.util.Scanner;

public class cwh_86 {
    public static void main(String[] args) {
        // int a=4 //syntax error
        // float b=4.0; //syntax error
        // int age=78;
        // int yearborn = 2000-78;//logical error
        // System.out.println(6/0);//exception error

        int a = 4;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Haha..." + e);
        } catch (IllegalArgumentException e) {
            System.out.println("Hehe...." + e);
        }
    

    boolean flag = true;
    int[] marks = { 10, 20, 30 };
    Scanner Sc = new Scanner(System.in);
    int index;
    int i=0 ;
    while(flag&&i<5)
    {
        try {
            System.out.println("Enter the value of index");
            index = Sc.nextInt();
            System.out.println("The value of marks[index] is " + marks[index]);
            break;
        } catch (Exception e) {
            System.out.println("Invalid Index");
            i++;
        }
    }if(i>=5)
    {
        System.out.println("Error");
    }

}
}
