public class binarysearch{
    public static void main(String[] args){
        int side = 5;
        int totaltiles = 8;
        int left = 1;
         int right = 8;
         int ans = 0;
         while(left<=right){
            int mid = (left+right)/2;
            if((mid * mid) == totaltiles){
                System.out.print(mid);
                break;
            }
            else if(mid * mid < totaltiles){
                ans = mid *mid;
                left = mid+1;
            }
            else right = mid-1;
         }
         System.out.println(ans*(side * side)+"sqrt");
    }
}