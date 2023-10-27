import java.util.LinkedList;

public class RetrieveFirstElement {
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(25);
        linkedList.add(30);
        linkedList.add(35);
        linkedList.add(40);

        if (!linkedList.isEmpty()) {
            Integer firstElement = linkedList.getFirst();
            
            System.out.println("The first element is: " + firstElement);
        } else {
            System.out.println("The linked list is empty.");
        }
    }
}







