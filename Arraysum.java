import java.util.Scanner;

public class Arraysum{
    public static void main(String args[]){
        int[] a=new int[8];
        int sum=0;
         
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an Array");
        
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<a.length; i++){
            sum=sum+a[i];
        }
        System.out.println("Sum of Array is" +sum);
        
    }
}