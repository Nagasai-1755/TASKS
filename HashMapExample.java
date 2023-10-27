package second;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("sai", 22);
        hashMap.put("chari", 30);
        hashMap.put("ashok", 28);
        hashMap.put("bharath", 58);

        String specifiedKey = "ashok";

        Integer value = hashMap.get(specifiedKey);

        if (value != null) {
            System.out.println("Value for key '" + specifiedKey + "': " + value);
        } else {
            System.out.println("Key '" + specifiedKey + "' not found in the HashMap.");
        }

        Set<String> keySet = hashMap.keySet();
        System.out.println("Keyset of the HashMap: " + keySet);
    }
}
