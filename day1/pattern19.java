public class pattern19 {
    public static void main(String[] args) {
        int N = 3;
        int space = 0;

        for(int t = 1; t <= N; t++) {        // triangle loop
            for(int i = 1; i <= N; i++) {    // rows

                // spaces
                for(int s = 1; s <= space; s++) {
                    System.out.print(" ");
                }

                // stars
                for(int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
            space += 6;   // diagonal shift
        }
    }
}