

public class flippedelement{
    public static void main(String[] args) {
        int n  = 10;
        int m = 20;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));
        int xor = n^m;
        int count = 0;
        while(xor > 0){
            if((xor & 1) == 1){
                count++;
            }
            xor >>= 1;
        }
        System.out.println(count);
    }
}