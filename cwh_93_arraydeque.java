import java.util.*;
public class cwh_93_arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(4);
        ad1.add(40);
        ad1.add(400);
        ad1.add(4000);
        ad1.addFirst(5);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
