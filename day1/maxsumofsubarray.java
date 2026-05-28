public class maxsumofsubarray{
    public static void main(String[] args) {
        int[] arr = {2,5,-7,1,8};
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                }
                if(max < sum)
                    max = sum;
            }
        }
        System.out.println(max);
    }
}