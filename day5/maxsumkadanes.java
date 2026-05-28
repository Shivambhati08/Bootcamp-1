public class maxsumkadanes{
    public static void main(String[] args) {
        int arr[] = {-2,-1,-4,-2,-3,3,-1,4};
        int currsum = arr[0];
        int maxsum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currsum = Math.max(arr[i], currsum + arr[i]);
            maxsum = Math.max(currsum, maxsum);
        }
        System.out.println("Maximum subarray sum = "+maxsum);
    }
}