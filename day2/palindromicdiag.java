
import java.util.Scanner;

public class palindromicdiag{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input a number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
               int val = i>j ? i-j+1 : j-i+1;
               System.out.print(val+" "); 
            }
            System.out.println();
        }
    }
}