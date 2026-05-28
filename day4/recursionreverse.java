public class recursionreverse{
    public static void dosomething(int n, int sum) {
        if(n == 0){
            System.out.println(sum);
            return;
        }
        System.out.println(n % 10);
        dosomething(n / 10, n % 10);
        // System.out.println(sum);
    }
    public static void main(String[] args) {
        int num = 1483;
        dosomething(num , 0);
    }
}