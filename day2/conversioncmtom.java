
import java.util.Scanner;

public class conversioncmtom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. CM to M: \n2.KG to G: ");
        int n = sc.nextInt();
        int num; 
        switch (n) {
            case 1:System.out.print("Enter the value in Centimeter: "); 
                    num = sc.nextInt();
                    System.out.println("meter = "+(float)(num/100.0));
                break;
            case 2: System.out.print("Enter the value in Kilogram: "); 
                    num = sc.nextInt();
                    System.out.println("Grams = "+(num*1000));
                break;
            default:
                System.out.println("Enter a valid choice");
        }
    }
}