
import java.util.Scanner;

public class numbertrianglepattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        int value,diff;
        for(int i = 1; i <= N; i++){
            value = i;
            diff = N-1;
            for(int j = 1; j <= i; j++){
                System.out.print(value+" ");
                value += diff;
                diff--;
            }
            System.out.println();
        }
    }
}