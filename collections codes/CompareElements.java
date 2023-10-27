import java.util.HashSet;
import java.util.Set;

public class CompareElements {
    public static void main(String[] args) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(100);
        set1.add(200);
        set1.add(300);
        set1.add(400);

        set2.add(600);
        set2.add(900);
        set2.add(300);
        set2.add(500);

        System.out.println("Original Set 1: " + set1);
        System.out.println("Original Set 2: " + set2);

        set1.retainAll(set2);

        System.out.println("Same Elements: " + set1);
    }
}
