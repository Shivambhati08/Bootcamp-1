public class maxsubarraysum{
    public static void main(String[] args) {
        int arr[] = {20, -1, -1, -1, -1, -1, -1, -1, -1};
        int currsum = arr[0];
        int maxsum = arr[0];
        for(int i = 1; i < arr.length; i++){
            currsum = Math.max(arr[i], arr[i]+ currsum);
            maxsum = Math.max(maxsum, currsum);
        }
        System.out.println("Maximum subarray = " +maxsum);
    }
}