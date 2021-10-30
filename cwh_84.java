//throw keyword is used to throw an exception expilicitly by programmer
//throws keyword is used to declare an exception
//throws:-Give info to programmer that there might be an exception!

//suppose user give a negative number as a radius
//and we want to show a exception here!
//we have to create a custom exception for negativenumber
class NegativeRadiusException  extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be nagative!";
    }
}

public class cwh_84 {
    public static double area(int r) throws  NegativeRadiusException{
     if(r<0){
       throw new NegativeRadiusException();
     }
     double  result =Math.PI*r*r;
     return result;
    }
    public static int divide(int a , int b) throws ArithmeticException{
        int result =a/b;
        return result;
    }
    public static void main(String[] args) {
   try{
       int c=divide(6, 0);
   }catch (Exception e){
       System.out.println("Exception");
   }
   try{
       double ar=area(-1);
   }catch (Exception e){
       System.out.println("Exception");
   }
    }
}
