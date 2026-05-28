public class countnumofdig{
    public static int countdig(int n){
        if(n == 0) return 0;
        return 1+countdig(n/10);
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(countdig(n));
    }

}