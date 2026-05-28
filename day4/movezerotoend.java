public class movezerotoend{
    public static void main(String[] args) {
        int arr[] = {1,2,3,0,2,0,3,4,0,5,0,3};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                int temp = arr[i];
                for(int j = i; j < n-1; j++){
                   arr[j] = arr[j+1];
                }
                arr[n-1] = temp;
                i--;
                n--;
            }
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}