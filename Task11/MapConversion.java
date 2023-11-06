import java.util.HashMap;
import java.util.TreeMap;

public class MapConversion {
    public static void main(String[] args){
        HashMap<Integer,String> HM = new HashMap<>();
        HM.put(101, "Apple");
        HM.put(103, "Banana");
        HM.put(104, "Jawa");
        HM.put(102, "Mango");

        System.out.println("HashMap :"+HM);
        TreeMap<Integer,String> TM = new TreeMap<>(HM);
        System.out.println("TreeMap converted from HashMap :"+TM);


    }
}
