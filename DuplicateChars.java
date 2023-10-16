public class DuplicateChars {
    public static void main(String[] args) {
        String input = "My name is Guarav Kukade!";
        findDuplicateChars(input);
    }

    public static void findDuplicateChars(String str) {
        str = str.toLowerCase(); 
        int[] charCount = new int[26]; 

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {  
                charCount[ch - 'a']++;
            }
        }

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                char duplicateChar = (char) (i + 'a');
                System.out.println("char : "+duplicateChar+", count: "+charCount[i]+" times") ;
               
            }
        }
    }
}
