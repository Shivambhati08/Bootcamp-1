
import java.util.Scanner;

public class armstrongnum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0; 
        while(n != 0){
            count++;
            n /= 10;
        }
        n = temp;
        int sum = 0;
        while (n != 0) { 
            int mul = 1;
        for(int i = 1; i <= count; i++){
                mul *= n%10;
            }
            sum += mul;
            n /= 10;
        }
        if(sum == temp)
            System.out.println("Armstrong Number");
        else 
            System.out.println("Not a armstrong number");
    }
}