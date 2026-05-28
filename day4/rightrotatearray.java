public class rightrotatearray{
    public static void rightrotate(int arr[], int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int d = 2;
        int n = arr.length;
         d = d % n;
        rightrotate(arr, 0, n-1);
        rightrotate(arr, 0, d-1);
        rightrotate(arr, d, n-1);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}