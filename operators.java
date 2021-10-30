// precedence & Associativity of operators
import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        int a=6*5-34/2;//acc to boardmass rule ans should be 17
        /*
          30-34/2
          30-17
          13 ans
        */
        int b=60/5-34*2;
        /*multiplication & division have same precedence 
        so we use associativity
        *,/ ki asso left to ryt hoti h issliye uske acc evaluate hoga
        12-34*2
        12-68
        -56 ans
        */
        System.out.println(a);
        System.out.println(b);//but java cannot follow boardmass rule
        //java follow precedence & Associativity 
//precedence:-jo bada operator hota hai vo phle evaluate hoga
//a=6*5-34/2 isme multiplication & division ki precedence equal h fir hoga subtraction
//acc to precedence
/*
QUICK QUIZ
How will you write the following operations in java?
1)x-y/2
2)(b^2-4ac)/2a
3)v^2-u^2
4)a*b-d
SOLUTIONS:-
1)int x=6;
int y=7;
int k=x*y/2
----------------------------------
2)
int b=1;
int c=4;
int a=6;
int k=b*b-(4*a*c)/(2*a);
----------------------------------
3)
int v=4;
int u=3;
int k=v*v-u*u
---------------------------------
4)
int a=4;
int b=4;
int d=4;
int k=a*b-d;
*/

}
}