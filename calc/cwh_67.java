package calc;
class calculator{
    public void calculate(int a,int b) {
        System.out.println("your result is:-"+ a+b);
    }
}
class sccalculator{
    public void calculate(int a,int b) {
        System.out.println("your result is:-"+ (a-b)*(a+b));
    }
}
class Hcalculator{
    public void calculate(int a,int b) {
        System.out.println("your result is:-"+ a+b);
        System.out.println("your result is:-"+ Math.sin(a+b));
        System.out.println("your result is:-"+ (a-b)*(a+b));

    }
}

public class cwh_67 {
    public static void main(String[] args) {
      calculator c=new calculator();
      sccalculator sc=new sccalculator();
      Hcalculator H=new Hcalculator();
      c.calculate(5, 6);
      sc.calculate(8, 4);
      H.calculate(6, 2); 
    }
}
//In terminal
//javac cwh_67.java --> creation of class
//javac -d . *.java --> all class file import in one floder (package calc file)
//java calc/cwh_67  --> Running the code

//no if you want to create the levels of floders then;
//package folder.folder1.folder2;-->folder2 m clssses rhege
//javac filename.java --> creation of class
//javac -d . *.java --> all class file import in one floder (package calc file)
//java folder/filename  --> Running the code