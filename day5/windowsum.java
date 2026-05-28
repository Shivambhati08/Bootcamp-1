public class windowsum{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,1,2,5,4};
        int n = arr.length;
        int w = 3;
        int windowsum = 0;
        int maxwindowsum = 0;
        for(int i = 0; i < w; i++){
            windowsum += arr[i];
        }
        maxwindowsum = windowsum;
        for(int i = w; i < n; i++){
            windowsum = windowsum + arr[i] - arr[i-w];
            maxwindowsum = Math.max(maxwindowsum, windowsum);
        }
        System.out.print("Maximum window sum = "+maxwindowsum);
    }
}