import java.util.ArrayList;
import java.util.Collection;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(9);
        nums.add(8);
        nums.add(7);
        nums.add(6);
        nums.add(5);
        nums.remove(4);
        nums.set(1,22);
        for (int n : nums) {
            System.out.println(n);
        }
    }
}