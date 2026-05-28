    
    public class reverse{
        static int reversenum(int n){
            int rev = 0;
            if(n == 0) return rev;

            // int d = n % 10 ;
             rev = rev*10 + (n % 10);
           return reversenum(n/ 10);
        }
    
    public static void main(String[] args) {
        int n = 1234;
        int ans = reversenum(n);
        System.out.println(ans);
    }
}