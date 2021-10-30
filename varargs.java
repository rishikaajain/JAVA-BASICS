public class varargs {
  /*  static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    */
    static int sum(int...arr){ //available as int []arr
        int result=0;
        for(int element:arr){
            result  += element;
        }
     return result;
    }
    public static void main(String[] args) {
        
        System.out.println("The sum of 4 & 5 is:"+ sum(4, 5));
        System.out.println("The sum of 4 , 5 ,6 is:"+ sum(4, 5,6));
        System.out.println("The sum of 4 , 5,6,7  is:"+ sum(4, 5,6,7));
    }
}
