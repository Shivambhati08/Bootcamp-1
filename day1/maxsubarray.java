public class maxsubarray{
    public static void main(String[] args){
        int arr[] = {1,3,5,7,9};
        int max = Integer.MIN_VALUE;
        for(int i =  0; i <=4; i++){
            for(int j = i; j <= 4; j++){
                int sum = 0;
                for(int k = i; k <=j; k++){
                    sum += arr[k];
                }
                if(sum> max){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}