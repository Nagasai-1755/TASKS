package ExceptionHandling;

public class Finalblockinmulti{
	public static void main(String[] args){
		try{
			firstMethod();
		}
		catch(Exception e){
			System.out.println("Catch block in main method");
		}
		finally{
			System.out.println("Finally block in main method");
		}
	}
	public static void firstMethod(){
		try{
			secondMethod();
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Finally block in first method");
		}
	}
	public static void secondMethod()throws Exception{
		try{
			throw new Exception("raised an exception in second method");
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		finally{
			System.out.println("Finally block in second method");
		}
	}
		
	
}
