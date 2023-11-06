import java.util.TreeMap;
public class LowestAndHighestInMap {
    public static void main(String []args){
        TreeMap<Integer,String> tp=new TreeMap<>();
        tp.put(3,"Three");
        tp.put(4,"Four");
        tp.put(1,"One");
        tp.put(2,"Two");
        System.out.println(tp);

        System.out.println("Lowest Key :"+tp.firstEntry().getKey());
        System.out.println("Highest Key :"+tp.lastEntry().getKey());
    }
}
