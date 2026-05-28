
public class kthbit {
    public static void main(String[] args) {
        int n = 10;
        int k = 1;
        if((n & (1 << k)) != 0){
            System.out.println("Kth bit is set");
        }
        else {
            System.out.println("Kthbit is not set");
        }
    }
}
