import java.util.*;
public class Sum {
	public static void main(String[] args) {
		int i =2;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr n number");
		int n = scan.nextInt();
		scan.close();
		
		while(i<=n) {
			sum = sum+i;
			i+=2;
		
		}
		System.out.println("The sum of even numbers is " +sum);
	}
}