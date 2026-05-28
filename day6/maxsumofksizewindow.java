public class maxsumofksizewindow{
    public static void main(String[] args) {
        int arr[] = {1,2,7,4,2,6,5,2,1,8};
        int n = arr.length;
        int m = 4;
        int maxwindow = 0;
        int maximum = 0;
        for(int i = 0; i < m ; i++){
            maxwindow += arr[i];
        }
        for(int i = m; i < n; i++){
            maxwindow = maxwindow + arr[i] - arr[i-m];
            if(maximum < maxwindow){
                maximum = maxwindow;
            }
        }
        System.out.println("max sum of window = "+maximum);
    }
}