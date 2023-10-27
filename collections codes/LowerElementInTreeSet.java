import java.util.TreeSet;

public class LowerElementInTreeSet {
    public static void main(String[] args) {
       
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        int givenElement = 35;

        Integer lowerElement = treeSet.lower(givenElement);

        if (lowerElement != null) {
            System.out.println("The greatest element in the TreeSet less than " + givenElement + " is: " + lowerElement);
        } else {
            System.out.println("No element in the TreeSet is strictly less than " + givenElement);
        }
    }
}
