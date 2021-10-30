import java.util.HashSet;

public class cwh_95_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        // Has Default Initial capacity of 16 and Default Load factor as 0.75

        h.add(6); // 6 % 4 =2
        h.add(8); // 8 % 4 =0
        h.add(3); 
        h.add(11);
        h.add(11);
        System.out.println(h);

    }
}
