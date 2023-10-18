
import java.util.Scanner;
public class matadd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter no. of columns: ");
		int column = sc.nextInt();
		int[][] a = new int[row][column];
		int[][] b = new int[row][column];
		int[][] c = new int[row][column];
		System.out.println("Enter First matrix");
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Second matrix");
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Addition of matrix is: ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
		
	}

}