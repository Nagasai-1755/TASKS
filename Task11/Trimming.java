import java.util.ArrayList;

public class Trimming {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(10);
        System.out.println("ArrayList capacity : " + arrayList.size());

        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");
        System.out.println("ArrayList capacity before trimming: " + arrayList.size());

        arrayList.trimToSize();
        
        System.out.println("ArrayList elements after trimming:" +arrayList);

        System.out.println("ArrayList capacity after trimming: " + arrayList.size());
    }
}