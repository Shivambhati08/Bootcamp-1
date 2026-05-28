public class maximumsubarraysum {
    public static void main(String[] args) {
        int arr[] = {3,-1,6,-2,1};
        int sum = 0; 
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxsum = Math.max(maxsum, sum);
            }
            sum = 0;
        }
        System.out.println("Maximum sum = "+maxsum);
    }
}
