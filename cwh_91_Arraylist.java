import java.util.*;
public class cwh_91_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(5);
        l2.add(10);
        l2.add(15);
        l2.add(20);
        l2.add(15);
        l1.add(6);
        l1.add(4);
        l1.add(0,2);
        l1.add(0,1);
        l1.addAll(l2);//ending se add hoga

      System.out.println(l1.contains(7));//false (7 list m ni h)
      System.out.println(l1.indexOf(15));
      System.out.println(l1.lastIndexOf(15));


       // l1.addAll(0,l2);//starting se add hoga
      // l1.clear();
      // l1.clone();//copy arraylist for instance
       
       l1.set(1,566);
      System.out.println(l1.isEmpty()); 
      l1.remove(0);
      System.out.println(l1.listIterator());
       for(int i=0;i<l1.size();i++){
           System.out.print(l1.get(i));
           System.out.print(", ");
        }
  
  
    }
}
