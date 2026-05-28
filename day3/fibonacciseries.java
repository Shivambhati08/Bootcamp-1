public class fibonacciseries{
    public static void main(String[] args) {
        int n = 10;
        int a = 1, b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i = 3; i <= n; i++){
            // System.out.print("");
            int temp = b;
            b = a + b;
            a = temp;
            System.out.print(b+" ");
        }
    }
}