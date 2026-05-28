
import java.util.Scanner;

public class saddleelement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 3;
        int arr[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int row = 0;
        int max = arr[0][0];
        int min = arr[0][0];
        for(int i = 0; i < n; i++){
             for(int j = 0; j < m; j++){
                if(min > arr[i][j]){
                    min = arr[i][j];
                    row = i;
                }
             }
        }
        for(int j = 0; j < m; j++){
            if(max < arr[row][j]){
                min = arr[row][j];
            }
        }
        if(max == min){
            System.out.println("Saddle point = "+max);
        }
    }
}