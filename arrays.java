import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        //array is the collection of similar type of data
        //indexing starts from 0
        //suppose you have to store the marks of 5students
       //there are 3 ways to declare array
       //1st:-
      /* int [] marks;//.........declaration
       marks=new int[5];//.........memory allocation
       */
      //2nd:- 
     /* int [] marks=new int[5];
     ........declaration+allocation
      marks is refrence and new int[5]is object
      */
      //3rd:-
    //  int[]marks={100,20,70,80,98}; declare+intialize//
    /*float []marks1 ={100,20.08f,70.98f,80.9f,98.67f};
    String [] students={"Rishika","Aman","Kishan","Stuti","Deepika"};
    System.out.println(students[1]);
    System.out.println(marks1[2]);
    System.out.println(students.length);
    */
    int[] marks ={100,20,70,80,98};
    System.out.println(marks.length);
    //displaying of array method 1:-
    System.out.println("method1:-navie way");
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    System.out.println(marks[3]);
    System.out.println(marks[4]);
    System.out.println("method 2:-using for loop");
  //method 2:-
  for(int i=0;i<marks.length;i++){
      System.out.println(marks[i]);
  }
  System.out.println("reverse order");
  for(int i=marks.length-1;i>=0;i--){
      System.out.println(marks[i]);
  }
  System.out.println("display array  by using for each loop");
//for each loop trvsal each element of array
for(int element:marks){
    System.out.println(element);
}

}
}
