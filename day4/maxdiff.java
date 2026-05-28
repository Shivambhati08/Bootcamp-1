public class maxdiff{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,8,0};
        int n = arr.length;
        
        int min = arr[0];
        int maxdif = arr[1] - arr[0];
        for(int i = 1; i < n; i++){
            maxdif = Math.max(maxdif, arr[i]-min);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Maximum difference = "+maxdif);
    }
}