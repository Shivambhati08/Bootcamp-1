public class gcd{
    public static void main(String[] args) {
        int x = 10;
        int y = 4;
        while(y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println("GCD = "+x);
    }
}