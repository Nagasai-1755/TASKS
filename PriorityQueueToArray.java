import java.util.PriorityQueue;
import java.util.Arrays;

public class PriorityQueueToArray {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(3);
        priorityQueue.offer(8);
        priorityQueue.offer(1);
        priorityQueue.offer(4);

        Integer[] array = priorityQueue.toArray(new Integer[priorityQueue.size()]);

        System.out.println("Elements in the array from PriorityQueue: " + Arrays.toString(array));
    }
}
