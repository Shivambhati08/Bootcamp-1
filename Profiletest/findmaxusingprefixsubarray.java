public class findmaxusingprefixsubarray {
    public static void main(String[] args) {
        int arr[] = {1,-2,3,4,-6,-4,5,6};
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(i == 0){
                    currsum = prefix[j];
                }
                else {
                    currsum = prefix[j] - prefix[i-1];                
                }
                maxsum = Math.max(maxsum, currsum);
            }
        }
        System.out.println("Maximum sum = "+maxsum);
    }
}
