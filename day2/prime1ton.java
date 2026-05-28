
import java.util.Scanner;

public class prime1ton{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<=1)
            System.out.println("No prime number");
        else {
            while(n != 1){
                int temp = n;
                int count = 0;

            for(int i = 1; i <= temp; i++){
                if(temp%i == 0){
                    count++;
                }
                
                }
                if(count == 2)
                    System.out.print(temp+" ");
                n--;
            }
        }
    }
}