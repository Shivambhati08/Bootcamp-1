public class usinglooptofindmaxarea{
    public static void main(String[] args){
        int side = 5;
        int totaltiles = 8;
         int ans = 1;
         int i = 1;
         while(i<totaltiles){
            if(i*i < totaltiles){
            ans = i*i;
            i++;
            }
            else if(i*i == totaltiles){
                ans = i*i;
                break;
            }
            else {
                break;
            }
         }
         System.out.println(ans*(side * side)+"sqrt");
    }
}