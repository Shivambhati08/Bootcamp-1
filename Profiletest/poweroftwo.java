public class poweroftwo{
    public static int power(int n){
        // int num = 0;
        
        if(n == 1) return 0;
        if(n <= 0 || n % 2 != 0)
            return -1;
        // power(n/2);
        return 1+power(n/2);
    }
    public static void main(String[] args) {
        int n = 256;
        int res = power(n);
        if(res == -1)
            System.out.print(n+" is not exponent of 2");
        else
        System.out.println("power of two = "+res);
    }
}