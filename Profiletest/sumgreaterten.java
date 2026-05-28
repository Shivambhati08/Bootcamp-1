public class sumgreaterten{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,3,4,8};
        int left = 0, right = -1, sum = 0, minsize = Integer.MAX_VALUE;
        while(right < arr.length && left < arr.length){
            if(sum >= 10 || right == arr.length-1){
                int len = right - left + 1;
                minsize = Math.min(len, minsize);
                sum = sum - arr[left];
                left++;
            }
            else if(right < arr.length){
                right++;
                sum = sum + arr[right];
            }
        }
    }
}