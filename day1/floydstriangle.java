
import java.util.Scanner;

public class floydstriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input number of rows: ");
        int n = sc.nextInt();
        int ele = 1;
        for(int i = 1; i <=n; i++){
            for(int j= 1; j <= i; j++){
                System.out.print(ele+" ");
                ele++;
            }
            System.out.println();
        }
    }
}