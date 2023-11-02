package ExceptionHandling;


import java.util.Scanner;
public class  NumberFormatException extends Exception{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as a string: ");
        String str = sc.nextLine();
        try {
            int i = Integer.parseInt(str);
            double doub = Double.parseDouble(str);
            System.out.println("Successfully converted to an integer: " + i);
            System.out.println("Successfully converted to a double: " + doub);
        } catch (Exception e) {
            System.out.println("Error: Unable to convert the input to a numeric value.");
        }
     }
} 