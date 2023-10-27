package second;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map;

public class GetFloorEntryInTreeMap {
    public static void main(String[] args) {
        
        NavigableMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "sinu");
        treeMap.put(20, "Balu");
        treeMap.put(30, "Chintu");
        treeMap.put(40, "ramu");
        treeMap.put(50, "ramesh");

        int givenKey = 35;
        Map.Entry<Integer, String> floorEntry = treeMap.floorEntry(givenKey);

        if (floorEntry != null) {
            System.out.println("Key-Value Mapping for the Greatest Key Strictly Less Than : " + givenKey );
            System.out.println("Key: " + floorEntry.getKey());
            System.out.println("Value: " + floorEntry.getValue());
        } else {
            System.out.println("No key strictly less than " + givenKey + " found in the TreeMap.");
        }
    }
}
