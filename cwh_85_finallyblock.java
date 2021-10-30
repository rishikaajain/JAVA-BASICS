public class cwh_85_finallyblock {
    public static int greet(){
        try{
            int a=50;
            int b=0;
            int c=a/b;
            return c;
        }catch(Exception e){
            System.out.println(e);
        }
    finally{
        System.out.println("END!");
    }
    return -1;
    }
    public static void main(String[] args) {
    int k= greet();
    System.out.println(k);
    int a=9;
    int b=3;
    while(true){
        try{
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e);
            break;
        }
        finally{
            System.out.println("Final value of b ="+b);
        }
        b--;
    }
    //when we use try with finally that means you're not handling exception therefore error statement will be there
    try{
        System.out.println(50/10);
    }
    finally{
        System.out.println("Yes,You can use finally with try");
    }
    }
}
