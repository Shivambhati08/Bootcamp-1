public class mathtofindsquare{
    public static void main(String[] args){
        int side = 5;
        int totaltiles = 8;
         int ans = (int)Math.sqrt(totaltiles);
         ans *= ans;
         System.out.println(ans*(side * side)+"sqrt");
    }
}