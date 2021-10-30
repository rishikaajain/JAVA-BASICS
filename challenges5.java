import java.util.Scanner;
import java.util.Arrays;
public class challenges5 {
    public static void main(String[] args) {
        //create array of 5 floats and calculate their sum
       /* float []arr ={10.0f,20.12f,30.78f,40.09f,50.99f};
       float sum=0;
        for(float element:arr){
            sum += element;
        }
        System.out.println(sum);
        */

        //write a program to find out whether a given integer is present in array or not
      /* Scanner sc=new Scanner(System.in);
         System.out.println("enter any integer:-");
        int a=sc.nextInt();
        boolean isInArray =false;
        int []arr={10,20,30,40,50};
        for(int element:arr){
            if(a==element){
                isInArray =true;
                break;
         }
         }
         if(isInArray){
             System.out.println("present in array");

         }else{
             System.out.println("not in array");
         }
*/
      //create a program to add two matrices of size 2*3

    int [][]mat1 ={{1,2,3},
                     {4,5,6}};
    int [][]mat2 ={{1,2,3},
                     {4,5,6}};
    int [][] result= new int[2][3];
    /*result[0][0] = 5;
    // printing the elements of 2-D array

        // method 1
        // for (int[] u: result) {
        // for (int element: u) {
        // System.out.print(element+" ");
        // }
        // System.out.println("");
        // }

        // method 2
        // for (int[] val : result) {
        // System.out.println(Arrays.toString(val));
        // }

        // method 3
        // System.out.println(Arrays.deepToString(result));

        // method 4
        // for (int i = 0; i < result.length; i++) {
        // for (int j = 0; j < result[i].length; j++) {
        // System.out.print(result[i][j]+" ");
        // }
        // System.out.println("");
        // }


    for (int i = 0; i < result.length; i++) {
        for (int j = 0; j < result[i].length; j++) {
            System.out.print(result[i][j]+" ");
        }
        System.out.println("");
    }*/
     for(int i=0;i<mat1.length;i++){
        for(int j=0;j<mat1[i].length;j++){
          result[i][j]=mat1[i][j]+mat2[i][j];
          System.out.print(result[i][j]+" ");
        }
        System.out.println("");
    }


    
    // int []a={10,30,40,60};
    // System.out.println(a.length);
    // for(int i=a.length;i>=0;i--){
    //     System.out.println(a[i]);
    // }

    }
}
