import java.util.Scanner;
public class cubeofAintoB{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input a number: ");
        int n = sc.nextInt();
        int a = 1, b = 1;
        for(int i = 2; i*i*i <= n; i++){
            int count = 0;
           while(n % i== 0){
                count++;
                n /= i;
           }
           for(int j = 0; j < count / 3; j++){
                 a *= i;
           }
           for(int k = 0; k < count % 3; k++){
            b *= i;
           }
        }
        b *= n;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}