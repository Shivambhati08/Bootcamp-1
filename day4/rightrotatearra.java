public class rightrotatearra{
    public static void rotate(int arr[], int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int m = 3;
        rotate(arr, 0, n-1);
        rotate(arr, 0, m-1);
        rotate(arr, m, n-1);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}