import java.util.Scanner;
public class palindrome1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while(n != 0){
            count++;
            n /= 10;
        }
        int rev = 0;
        n = temp;
        while(n != 0){
            rev = rev*10 + n% 10;
            n /= 10; 
        }
        if(rev == temp)
            System.out.println("palindrome");
        else 
            System.out.println("Not a palindrome");
    }
}