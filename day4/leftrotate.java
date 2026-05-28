public class leftrotate{
    public static void leftrotate(int arr[], int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int d = 2;
        
       leftrotate(arr, 0, d-1);
       leftrotate(arr, d, arr.length-1);
       leftrotate(arr, 0, arr.length-1);
       
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}