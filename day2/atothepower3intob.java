import java.util.Scanner;
public class atothepower3intob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = 1;
        long b = 1;
        for (long i = 2; i * i * i <= n; i++) {
            int count = 0;
            while (n % i == 0) {
                n /= i;
                count++;
            }
            // cube part → a
            for (int j = 0; j < count / 3; j++) {
                a *= i;
            }
            // remaining part → b
            for (int j = 0; j < count % 3; j++) {
                b *= i;
            }
        }
        // leftover factor
        b *= n;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}