import java.util.Scanner;

public class converttobinary{
    static int count(int n){
    if(n == 0) return 0;
    return 1+ count(n/10);
}
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int res = count(n);

        System.out.println("Number of digits = "+res);
    }
}