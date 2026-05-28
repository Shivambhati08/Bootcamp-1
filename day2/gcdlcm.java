public class gcdlcm{
    public static void main(String[] args) {
        int n = 18;
        int m = 7;
        int x  = n; 
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