import java.util.Scanner;
public class challenges4 {
    public static void main(String[] args) {
        /* 1Write a program to print the following pattern
           ****
           ***
           **
           *
        int n=4;
         for(int i=n; i>=0;i--){
             for(int j=0;j<=i;j++){
             System.out.print("*");
         }
         System.out.println("\n");
        }
           */
 
//Write a program to sum first n even numbers using a while loop.
 /*int sum=0;
 int n=3;
for(int i=0;i<=n;i++){
    sum=sum+(2*i);
}
 System.out.println(sum);
*/
//Write a program to print the multiplication table of a given number n.
/*int x=5;
for(int i=1;i<=10;i++){
   System.out.printf("%d * %d =%d\n",x,i,x*i );
}
*/
//Write a program to print a multiplication table of 10 in reverse order.
/*int x=5;
for(int i=10;i>=1;i--){
   System.out.printf("%d * %d =%d\n",x,i,x*i );
}
*/
//Write a program to find factorial of a given number using for loops.
/*int y=5;
int fact=1;
for(int i=1;i<=y;i++){
    //fact=fact*i;
    fact *=i;
}
System.out.println(fact);
*/
//What can be done using one type of loop can also be done using the other two types of loops - True or False.ans true
//Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
int n=8;
int sum=0;
for(int i=0;i<=10;i++){
    sum +=n*i;
}
System.out.println(sum);


 }
}
