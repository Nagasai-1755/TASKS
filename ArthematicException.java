package ExceptionHandling;
import java.util.Scanner;

public class ArthimaticExceptions {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Firstnum :");
		int Firstnum=sc.nextInt();
		System.out.println("Enter Secondnum :");
		int Secondnum = sc.nextInt();
		try {
			int sum=Firstnum+Secondnum;
			System.out.println("Addition of Firstnum and Secondnum:" +sum);
			int sub=Firstnum-Secondnum;
			System.out.println("Subtraction of Firstnum and Second num: "+sub);
			int mul=Firstnum*Secondnum;
			System.out.println("Multiplication of Firstnum and Second num: "+mul);
			
			if(Secondnum==0) {
				throw new ArithmeticException("zero can't be dividible");
			}
			int div=Firstnum/Secondnum;
			System.out.println("Division of Firstnum and Secondnum:"+div);
		}
		catch(ArithmeticException e) {
			System.out.println("ArthematicException:"+e.getMessage());
		}
		}

}
