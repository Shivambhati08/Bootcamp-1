
import java.util.Scanner;

public class vowelorconsonant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        switch (ch) {
            case 'a':
            case 'e': 
            case 'i': 
            case 'o': 
            case 'u': 
         System.out.println("vowel");
                break;
            default: System.err.println("Consonant");
        }
    }
}