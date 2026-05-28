
import java.util.Scanner;

public class sumoffirstnatural{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Sum of first natural number = "+((n*(n+1))/2));
    }
}