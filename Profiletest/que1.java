
import java.util.Scanner;

public class que1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        check : {
            if( n!= 0 && x % n == 0){
                System.out.print(x);
            break check;
            }
            else if(n != 0){
                System.out.print(x/n);
            }
            else {
                System.out.print(x);
            }
            break check;
        }
    }
}