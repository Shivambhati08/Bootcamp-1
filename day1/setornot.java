public class setornot{
    public static void main(String[] args) {
        int n = 13;
        int x = 1;
        x = x << 3;
        if((n & x) == x){
            System.out.println("Set");
        }
        else System.out.println("Not set");
    }
}