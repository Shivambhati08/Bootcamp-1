public class converttobinandshowdistinctbits {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        int xor = 1;
        while(a != 0){
            xor ^= a;
            a >>= 1;
        }
    }
}
