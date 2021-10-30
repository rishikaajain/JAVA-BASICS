//ques1 write a java program to print multiplication table of a number n
public class challenges6 {
static int multi(int x){
    int m=1;
   for(int i=1;i<=10;i++){
       m=x*i;
       System.out.println(m);
   }
    return m;
}
//pattern ques
static void pattern(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
//calculate sum of 1st n natural numbers
//sum(n)=1+2+3.....+n
//sum(n)=1+2+3....+n-1+n
//sum(n)=sum(n-1)+n
static int natural(int n){
    //base condition
     if(n==1){
    return 1;
    }
      return n + natural(n-1);
}
static void pattern1(int x){
    for(int i=x;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
static int fib(int a){
  /*  if(a==1){
        return 0;
    }else if(a==2){
        return 1;
    */
    if(a==1 || a==2){
      return a-1;
    }else{
        return fib(a-1)+fib(a-2);
    }
    }
static int arg(int ...avg){
    int sum=0;
    
    for (int i : avg) {
        sum += i;
         
     }
    return sum/avg.length;

}

static void patternRec(int n){
    if(n==0){
        return ;
    }
    for (int i = 1; i <=n; i++) {
        System.out.print("*");
    }
    System.out.println();
    patternRec(n-1);

}
static void patternRec1(int n){
    if(n==0){
        return ;
    }
    patternRec1(n-1);
    for (int i = 1; i <=n; i++) {
        System.out.print("*");
    }
    System.out.println();
}
    public static void main(String[] args) {
        // int a=5;
        // multi(a);
       //  pattern(4);
        // int c=natural(4);
        // System.out.println(c);
        // pattern1(4);
        //fibonacci series:- 0,1,1,2,3,5,8,13,21,34
        //Agr ques mai nth term bola hai to apni series 0 se strt hogi
        //Aur agr index bola hai to 1 se shuru hogi
     //int result=fib(5);
     //System.out.println(result);
      
     // int []a = {5,5,5,5,5,5,5};
     // System.out.println(arg(a));
     patternRec(5);
     patternRec1(5);
    }
}
