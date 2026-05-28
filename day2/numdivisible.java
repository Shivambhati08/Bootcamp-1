
import java.util.Scanner;

public class numdivisible{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input a positive number: ");
        int x = sc.nextInt();
        System.out.print("input the value of n: ");
        int n = sc.nextInt();
        
        if(x % n == 0){
            goto divisible;
        }
        else goto not_divisible;
            while(n != 0)
        divisible:
    System.out.print("Positive inter = "+x);
    }

}