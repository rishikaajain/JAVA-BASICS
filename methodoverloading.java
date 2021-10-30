public class methodoverloading {
    static void foo(){
        System.out.println("GOODMORNING! BRO");
    }
    static void foo(int a){ //a parameter hai
        System.out.println("GoodMorning"+ " " + a + " " +"Bro");
    }
    static void change(int x){
        x=98;
    }
    static void change2(int []arr){
        arr[0]=98;
    }
    static void telljoke(){
        System.out.println("You're a joker\n");
    }
    public static void main(String[] args) {
       //telljoke()
       //Case1:- changing the integer
       //int a=45;
       //change(a);
      // System.out.println("The value of a after running change is:"+ a);
      // value does'nt chnge bcz a ki cpy gai h change m 

      //Case2:- changing the array
     /* int []marks={80,54,87,75,90};
      change2(marks);
      System.out.println("The value of marks[0] after running change2 is:"+ marks[0]);
     */
      // value will chnge
     //marks reference h jo object ka address bta rha hai
     //array {80,54,87,75,90} yh object hai humne refernce marks ko
     //bjha hai chnge2 m issliye marks[0] chnge hojyega
     //mtlb pura object copy ni hoga srf refernce ki cpy shre hoga

     //-------------------------------------------//
     //NOTE:- IN CASE OF ARRAYS THE REFERNCE IS PASSED TO METHOD.
     //SAME IS THE CASE FOR OBJECT PASSING TO METHODS

     //--------------------------------------------//
     //METHOD OVERLOADING:-EK SE JADA METHOD KE NAM SAME HO SKTE 
    // HAI PAR USKA PARAMETER DIFFERENT HOGA.
    
    foo(); //argument
    foo(3000); //arguments are actual

    }
}
