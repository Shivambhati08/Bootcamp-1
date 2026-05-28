
import java.util.Arrays;

public class chocolatedistribution {
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,5,1,8,7,9};
        int m = 3;
        int n = arr.length;
        if(m == 0 || n < m){
            System.out.println("Distribution is not possible");
            return;
        }
            Arrays.sort(arr);
            int mindiff = Integer.MAX_VALUE;
            for (int i = 0; i + m -1 < n; i++) {
                int diff = arr[i+m-1] - arr[i];
                mindiff = Math.min(mindiff, diff);
            }
            System.out.println("minimum dfference = "+mindiff);
    }
}
