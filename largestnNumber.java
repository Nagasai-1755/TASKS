import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a :");
        int a=sc.nextInt();
        System.out.println("Enter b :");
        int b=sc.nextInt();
        System.out.println("Enter c :");
        int c=sc.nextInt();
        System.out.println("The largest of three numbers is " + largestNumber(a,b,c));

    }
    static int largestNumber(int a,int b,int c)
    {
        
        if(a>b && a>c){
            return a;
        } else if (b>a && b>c) {
            return b;

        }
        else {
            return c;
        }
    }
    
}