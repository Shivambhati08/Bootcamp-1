
import java.util.Scanner;

public class diffebtwbin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input first binary: ");
        int n = sc.nextInt();
        System.out.println("input second binary: ");
        int m = sc.nextInt();
        // int x = n;
        // int y = m;
        System.out.println(n+" in binary is "+(Integer.toBinaryString(n)));
        System.out.println(m+" in binary is "+Integer.toBinaryString(m));
        int xor = n^m;
        int count = 0;
        while(xor > 0){
            count += xor & 1;
            xor >>= 1;
        }
        System.out.println("Flipped number is "+count);
    }

}