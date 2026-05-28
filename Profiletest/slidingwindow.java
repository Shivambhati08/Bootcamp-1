public class slidingwindow{
    public static void main(String[] args) {
        int arr[] = {1,-2,3,4,-6,-4,5,6};
        int n = 4;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++){
        if(i < n){
            sum += arr[i];
        }
        else {
            sum = sum + arr[i] - arr[i-n];
        }
        if(max < sum){
            max = sum;;
        }
        if(i >= n-1)
        System.out.println("max sum = "+max);
        }
    }
}