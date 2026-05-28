public class recursion{
    public static void dosomething(int n){
        if(n == 50)
            return;
        int a = 10+ n;
        System.out.println(a);
        dosomething(a);
    }
    public static void main(String[] args) {
        int a = 0;
        dosomething(a);
    }
}