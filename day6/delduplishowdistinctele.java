public class delduplishowdistinctele{
    public static void main(String[] args) {
        int arr[] = {-1,-1,0,0,1,1,2,2};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1;j < n; j++){
                if(arr[j] == arr[j-1]){
                    for(int k = j; k < n-1; k++){
                        arr[k] = arr[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Number of distinct element = "+n);
    }
}