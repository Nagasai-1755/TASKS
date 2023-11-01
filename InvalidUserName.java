package ExceptionHandling;

import java.util.Scanner;

class InvalidUsernameException extends Exception{
    public InvalidUsernameException(String message){
        super(message);
    }

}
public class CustomException{
    public static void main(String[] args) throws InvalidUsernameException {
		try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            String special  = "[@_!#$%^&*()<>?}{~:]0123456789";
            for(int i=0;i<name.length();i++){
                if(special.indexOf(name.charAt(i)) >= 0){
                    throw new InvalidUsernameException("your name is invalid ");
					
                }
            }
			
            System.out.println("your name is valid");
			}
			catch(InvalidUsernameException e){
				System.out.println(e.getMessage());
			}
    }
}
