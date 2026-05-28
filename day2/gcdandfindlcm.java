import java.util.Scanner;
public class gcdandfindlcm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input first number: ");
        int n = sc.nextInt();
        System.out.print("input second nubmer: ");
        int m = sc.nextInt();
        int x = n; 
        int y = m;
        while(y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;
        int lcm = (n*m)/gcd;
        System.out.println("GCD = "+gcd);
        System.out.println("LCM = "+lcm);
    }
}