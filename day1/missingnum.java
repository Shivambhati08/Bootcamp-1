public class missingnum{
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int total_sum = 0, sum = 0;
        for(int i = 1; i <= 5; i++){
            total_sum += i;
        }
        for(int i = 0; i < 5-1; i++){
            sum += arr[i];
        }
        System.out.println(total_sum - sum);
    }
}