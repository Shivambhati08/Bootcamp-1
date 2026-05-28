
import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a nubmer: ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while(n != 0){
            count++;
            n /= 10;
        }
        n = temp;
        int rem = 0;
        for(int i = 1; i <= count; i++){
            rem = rem*10 + n%10;
            n /= 10;
        }
        if(rem == temp)
            System.out.println("Palindrome Number");
        else 
            System.out.println("Not a palindrome Number");
    }
}