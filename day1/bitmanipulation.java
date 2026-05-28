import java.util.Scanner;
public class bitmanipulation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1; i <= n+1; i++){
            x ^= i;
        }
        for(int i=0; i<n; i++){
            x ^= arr[i];
        }
        System.out.println(x);
    }
}