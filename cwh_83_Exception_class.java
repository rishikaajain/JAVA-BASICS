import java.util.Scanner;

class MyException  extends Exception {
    @Override
    public String toString(){
        return  "I am to string";
    }
    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
public class cwh_83_Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc =new Scanner(System.in);
        a=sc.nextInt();
        if(a<10){
            try{
                // throw  new MyException();
                throw  new ArithmeticException("This is exception");
            }
          catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());//tostring method explicity call
            System.out.println(e);//tostring method run hoga
            e.printStackTrace();
            System.out.println("END!");
          }
        }
    }
}
