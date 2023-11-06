package ExceptionHandling;
import java.util.Scanner;
import java.util.InputMismatchException;
class InvalidNumberException extends Exception{
     InvalidNumberException(String message){
         super(message);
     }
}

public class FactorialExceptionHandling {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        try {
            int number = sc.nextInt();
            if(number<0) {
                throw new InvalidNumberException("Negative Numbers not allowed");
            }
            int Fact = Factorial(number);
            System.out.println("the factorial of "+number+" is :"+Fact);
        }
        catch(InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e) {
            System.out.println("Invalid input please provide input in Integer format only");
        }
    }
    public static int Factorial(int number) {
        
    
        if(number==0) {
            return 1;
        }
        else {
        int factorial =1;
        for(int i=1; i<=number; i++) {
            factorial = factorial*i;
        }
        
        if(factorial<=0) {
            throw new ArithmeticException("Given number exceeds the Integer.MAX_VALUE");
        }
        return factorial;
        }
        
    }
}


