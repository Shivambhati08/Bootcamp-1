
public class alphabetmirror {

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            System.out.print((char) (i + 64));
        }
        for (int j = 6 - 1; j >= 1; j--) {
            System.out.print((char) (j + 64));
        }
            System.out.println();
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= 5 -i + 1; j++) {
                    System.out.print((char) (j + 64));
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print(" ");
            }
            for (int l = 6-i; l >= 1; l--) {
                    System.out.print((char) (l + 64));
            }
            System.out.println();
        }
    }
}
