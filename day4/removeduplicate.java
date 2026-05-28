public class removeduplicate{
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3,2,4,5,6,3,2,6,8,4,5};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    for(int k = j; k < n-1; k++){
                        arr[k] = arr[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        for(int x = 0; x < n; x++){
            System.out.print(arr[x]+" ");
        }
    }
}