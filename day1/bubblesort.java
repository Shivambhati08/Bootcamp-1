public class bubblesort{
    public static void main(String[] args) {
        int arr[] = {3,1,5,2,4};
        int n = arr.length;
        for(int i = 1; i < n; i++){
            for(int j = 1; j <= n-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}