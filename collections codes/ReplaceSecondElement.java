package second;

import java.util.ArrayList;

public class ReplaceSecondElement {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();

       
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");

       
        System.out.println("Original ArrayList: " + arrayList);

       
        if (arrayList.size() >= 2) {
            
            int indexToReplace = 1;

            
            String newElement = "TWO";

            
            arrayList.set(indexToReplace, newElement);

           
            System.out.println("Updated ArrayList: " + arrayList);
        } else {
            System.out.println("The ArrayList does not have at least two elements to replace the second element.");
        }
    }
}





