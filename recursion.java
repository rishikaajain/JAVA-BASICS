//if the function call itself again nd again then it is call recursion
public class recursion {
    //factorial(0)&factorial(1)=1
    //fact(n)=n*(n-1)......1
    //fact(n)=n*fact(n-1)
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    static int factiterative(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            int product =1;
            for(int i=1;i<=n;i++){
                product*=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x=5;
        System.out.println("factorial of 5 is:"+fact(x));
        System.out.println("factorial of 5 is:"+factiterative(x));
    }
}
