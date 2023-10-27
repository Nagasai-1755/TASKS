package second;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map;

public class GetCeilingEntryInTreeMap {
    public static void main(String[] args) {
        
        NavigableMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "A");
        treeMap.put(20, "B");
        treeMap.put(30, "C");
        treeMap.put(40, "D");
        treeMap.put(50, "E");
        
        int givenKey = 25;

        Map.Entry<Integer, String> ceilingEntry = treeMap.ceilingEntry(givenKey);

        if (ceilingEntry != null) {
            System.out.println("Key-Value Mapping for the Least Key Greater Than or Equal to : " + givenKey);
            System.out.println("Key: " + ceilingEntry.getKey());
            System.out.println("Value: " + ceilingEntry.getValue());
        } else {
            System.out.println("No key greater than or equal to " + givenKey + " found in the TreeMap.");
        }
    }
}
