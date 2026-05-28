public class maximumdifference {
    public static void main(String[] args) {
        int arr[] = {1,0,3,1,5,0};
        int maxdiff = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxdiff = Math.max(maxdiff, arr[i] - arr[i-1]);
        }
        System.out.println(maxdiff);
    }
}
