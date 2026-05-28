public class maximumsumofksizesubarray {
    public static void main(String[] args) {
        int arr[] = {-3,-2,-1,3,-1,4};
        int k = 3;
        int currsum = 0;
        for (int i = 0; i < k; i++) {
            currsum += arr[i];
        }
        int maxsum = currsum;
        for (int i = k; i < arr.length; i++) {
                currsum = currsum + arr[i]- arr[i-k];
                maxsum = Math.max(maxsum, currsum);
        }
        System.out.println("Maximum window sum = "+maxsum);
    }
}
