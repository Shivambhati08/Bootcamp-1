
public class distinctelearray{

    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 2, 3, 1, 6, 7, 2, 2, 4};
        int n = arr.length;
        int[] hash = {0,0,0,0,0,0,0,0,0,0,0};
        for(int i = 0; i < n; i++){
            int ele =  arr[i];
            hash[ele]++;
        }
        int sizebrr = 0;
        for(int j = 0; j < hash.length; j++){
            if(hash[j]> 0){
                sizebrr++;
            }
        }
        int[] brr = new int[sizebrr];
        int j = 0;
        for(int k = 0; k < hash.length; k++){
            if(hash[k] != 0){
                brr[j] = k;
                j++;
            }
        }
        for(int a : brr){
            System.out.print(a+" ");
        }
    }
}
