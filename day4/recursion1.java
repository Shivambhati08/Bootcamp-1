public class recursion1{
    public static void dosomething(int n){
        if(n == 30){
            System.out.println(n);
             return;
        }
        System.out.println(n);
        dosomething(n+10);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int a = 10;
        dosomething(a);
    }
}