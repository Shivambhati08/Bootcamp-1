public class movezerotoend1{
    public static void main(String[] args) {
        int arr[] = {1,0,5,8,0,2,0,9,0,1};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                for(int j = i;j <n-1; j++){
                    arr[j] = arr[j+1];
                }
                arr[n-1] = 0;
                n--;
                i--;
            }
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}